/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

import zakadabar.gradle.config
import zakadabar.gradle.isPublishing
import zakadabar.gradle.manifestAndDokka
import java.util.*

plugins {
    kotlin("multiplatform") version "1.8.0"
    kotlin("plugin.serialization") version "1.8.0"
    kotlin("plugin.noarg") version "1.8.0"

    application
    signing
    `maven-publish`

    id("com.palantir.docker") version "0.33.0"
    id("org.jetbrains.dokka") version "1.6.20"
    id("com.github.johnrengelman.shadow") version "7.1.2"
    id("zk-build-tasks") apply false
}

group = "io.dcctech.mafita"
version = "2023.1.10"

val isSnapshot = version.toString().contains("SNAPSHOT")

val stackVersion by extra { "2023.4.20" }
val datetimeVersion = "0.2.1"

// in TeamCity we can use the build number to find the generated docker image
println("##teamcity[buildNumber '${project.version}']")

repositories {
    mavenCentral()
    if (stackVersion.contains("SNAPSHOT")) {
        maven {
            url = project.uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
        }
        mavenLocal()
    }
}

application {
    mainClass.set("zakadabar.core.server.ServerKt")
}

noArg {
    annotation("kotlinx.serialization.Serializable")
}

kotlin {

    jvmToolchain(11)

    jvm {
        withJava()
    }

    js(IR) {
        browser {
            testTask {
                enabled = ! isPublishing
            }
        }
        binaries.executable()
    }

    sourceSets["commonMain"].dependencies {
        implementation("hu.simplexion.zakadabar:core:$stackVersion")
        implementation("hu.simplexion.zakadabar:accounts:$stackVersion")
        implementation("hu.simplexion.zakadabar:blobs:$stackVersion")
        implementation("hu.simplexion.zakadabar:i18n:$stackVersion")
        implementation("hu.simplexion.zakadabar:softui:$stackVersion")
        implementation("hu.simplexion.zakadabar:markdown:$stackVersion")
        implementation("hu.simplexion.zakadabar:schedule:$stackVersion")
        implementation("hu.simplexion.zakadabar:email:$stackVersion")

    }

}

// -----------------------------------------------------------------------------
// Built a fat JAR and server distribution package
// -----------------------------------------------------------------------------

tasks {
    shadowJar {
        mergeServiceFiles()
        //  minimize() // do not use minimize!!!
    }
}

apply(plugin = "zk-build-tasks")

// -----------------------------------------------------------------------------
// Build a docker image
// -----------------------------------------------------------------------------

docker {

    dependsOn(tasks["zkBuild"], tasks["zkDockerPrepare"], tasks["zkDockerCopy"])

    name = "${project.name}:${project.version}"

    pull(true)
    setDockerfile(file("Dockerfile"))

    buildArgs(
        mapOf(
            "BUILD_NUMBER" to Date().toString(),
            "STACK_VERSION" to stackVersion
        )
    )


}

// -----------------------------------------------------------------------------
// Publish artifacts to a Maven repository
// -----------------------------------------------------------------------------

if (project.isPublishing) {

    manifestAndDokka(tasks)

    signing { config(publishing.publications) }

    publishing {
        config(project)

        publications.withType<MavenPublication>().all {
            config(tasks["javadocJar"], "Mafita")
        }
    }

}