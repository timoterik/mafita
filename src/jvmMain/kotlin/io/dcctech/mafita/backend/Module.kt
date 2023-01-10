/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.dcctech.mafita.backend

import io.ktor.http.content.*
import io.ktor.routing.*
import zakadabar.core.authorize.AppRolesBase
import zakadabar.core.authorize.SimpleRoleAuthorizerProvider
import zakadabar.core.module.modules
import zakadabar.core.route.RoutedModule
import zakadabar.core.util.PublicApi
import io.dcctech.mafita.backend.business.ExampleEntityBl

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
            delete = MyRoles.myRole
        }

        modules += ExampleEntityBl()
    }

}

object MyRoles : AppRolesBase() {
    val myRole by "my-role"
    val siteMember by "site-member"
}