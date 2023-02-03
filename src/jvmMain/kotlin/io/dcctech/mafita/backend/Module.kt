/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.backend

import io.dcctech.mafita.backend.business.DocumentBl
import io.dcctech.mafita.backend.business.DocumentBlobBl
import io.ktor.http.content.*
import io.ktor.routing.*
import zakadabar.core.authorize.AppRolesBase
import zakadabar.core.authorize.SimpleRoleAuthorizerProvider
import zakadabar.core.module.modules
import zakadabar.core.route.RoutedModule
import zakadabar.core.util.PublicApi

@PublicApi
object Module : RoutedModule {

    override fun onInstallStatic(route: Any) {
        (route as? Route)?.preCompressed {
            files("precompressed")
        }
    }

    override fun onModuleLoad() {
        zakadabar.lib.accounts.install(MafitaRoles)
        zakadabar.lib.i18n.install()
        zakadabar.lib.schedule.install()
        zakadabar.lib.email.install()


        modules += SimpleRoleAuthorizerProvider {
            all = LOGGED_IN
            delete = MafitaRoles.siteUser
        }

//        modules += WorkerBl("worker1")  We will need this in the future
        modules += DocumentBl()
        modules += DocumentBlobBl()
    }

}

object MafitaRoles : AppRolesBase() {
    val contributor by "contributor"
    val siteUser by "site-member"
    val student by "student"
}