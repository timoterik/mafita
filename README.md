# Zakadabar Application Template

This repository contains an application template which you may use to start a new application project based on [Zakadabar](https://github.com/spxbhuhb/zakadabar-stack).

**NOTE:** This template uses JDK 14, it doesn't work on lower versions.

## Create

1. Create a new repository from this template ([Use this template](https://github.com/spxbhuhb/zakadabar-application-template/generate) button).

## Customize

1. Check out the new repository with IDEA.
2. Import the gradle project (optional):
    - IDEA might show you a bubble to "Load Gradle Config", or
    - Right click on `build.gradle.kts` in IDEA and then click on `Import Gradle Project`
3. Edit [settings.gradle.kts](settings.gradle.kts):
    1. Change project name.
4. Edit [build.gradle.kts](build.gradle.kts)
    1. Change `group` and `version`.
    1. Change parameters of the "zakadabar:zkCustomise" task:
        1. the package you would like to use,
        2. any other parameters you want to change.
5. Refresh gradle config in IDEA (optional).
6. Run the `zakadabar:zkCustomize` gradle task from IDEA or `./gradlew zkCustomize` from a shell.

At this point you have the source code of a fully functioning application.

## Run (During Development)

**Note** You can start the backend and/or the frontend directly from IDEAs Gradle panel. However, there is a bug in
the gradle / IDEA combo that sometimes prevents two gradle tasks running at the same time. If your second
task does not start, you can: 1) clear the gradle cache 2) open a terminal and issue the gradle command from the
project root directory.

Default configuration creates a local H2 database. You can change this in [stack.server.yaml](template/app/etc/stack.server.yaml).
With H2 the first run creates the database in `app/var`.

Default username and password is `so` and `so`. You can change the default password before database initialization in
[lib.accounts.yaml](template/app/etc/lib.accounts.yaml).

Start the backend with:

```shell
./gradlew run
```

Start the frontend with:

```shell
./gradlew jsBrowserRun --continuous
```

The first step starts the backend server. It listens on 8080. The second step starts a webpack devserver. It listens on 3000.

The webpack dev server forwards anything that starts with '/api' to the backend server.

To reload the web page after code changes, add `--continuous` to the arguments of the jsBrowserRun run configuration.

## Build Distributable Packages

Note: You might need to use IDEAs "Use Excluded Files" option in the "Project" panel to see the `build` directory.

### App Package

```shell
./gradlew zkBuild
```

In the `build/app` directory you will find:

- a zip file that contains your application
- the content of the zip file extracted

### Docker

```shell
./gradlew zkDocker
```

In the `build/app` directory you will find:

- a zip file that contains your application
- the content of the zip file extracted
- a docker compose file which contains a PostgreSQL server and your application

### Maven Publish

To sign and publish the artifacts generated by the project to a Maven repository:

1. Define the parameters (see below) in gradle properties (~/.gradle/gradle.properties) or in environment variables.
2. Check [publishing.kt](buildSrc/src/main/kotlin/zakadabar/gradle/publishing.kt) for publication config.

The signing uses gpg from the operating system, check [publishing.kt](buildSrc/src/main/kotlin/zakadabar/gradle/publishing.kt) and
the [signing](https://docs.gradle.org/current/userguide/signing_plugin.html) Gradle plugin for options.

| Gradle property           | Env variable              | Explanation                                        |
|---------------------------|---------------------------|----------------------------------------------------|
| `zk.publish`              | `ZK_PUBLISH`              | Configure the "publish" gradle task when not null. |
| `zk.publish.snapshot.url` | `ZK_PUBLISH_SNAPSHOT_URL` | URL of the snapshot repository.                    |
| `zk.publish.release.url`  | `ZK_PUBLISH_RELEASE_URL`  | URL of the release repository.                     |
| `zk.publish.username`     | `ZK_PUBLISH_USERNAME`     | Username for the repository.                       |
| `zk.publish.password`     | `ZK_PUBLISH_PASSWORD`     | Password for the repository.                       |
| `signing.gnupg.keyName`   | -                         | Name of the key to sign the produced artifacts.    |

