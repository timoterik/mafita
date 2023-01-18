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
import zakadabar.lib.schedule.business.WorkerBl

@PublicApi
object Module : RoutedModule {

    override fun onInstallStatic(route: Any) {
        (route as? Route)?.preCompressed {
            files("precompressed")
        }
    }

    override fun onModuleLoad() {
        zakadabar.lib.accounts.install(MyRoles)
        zakadabar.lib.i18n.install()

        modules += SimpleRoleAuthorizerProvider {
            all = LOGGED_IN
            delete = MyRoles.siteUser
        }


        zakadabar.lib.schedule.install()
        modules += WorkerBl("worker1")

        zakadabar.lib.email.install()

        modules += DocumentBl()
        modules += DocumentBlobBl()
    }

}

object MyRoles : AppRolesBase() {
    val contributor by "contributor"
    val siteUser by "site-member"
    val student by "student"
}