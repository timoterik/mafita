/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser


import io.dcctech.mafita.frontend.browser.pages.DocumentCrud
import io.dcctech.mafita.frontend.browser.pages.MembershipAccountCrud
import io.dcctech.mafita.resources.strings
import kotlinx.browser.window
import zakadabar.core.authorize.appRoles
import zakadabar.core.browser.sidebar.ZkSideBar
import zakadabar.core.browser.util.io
import zakadabar.core.resource.localized
import zakadabar.lib.accounts.browser.accounts.Account
import zakadabar.lib.accounts.browser.accounts.AccountSecure
import zakadabar.lib.accounts.browser.login.Login
import zakadabar.lib.accounts.browser.roles.Roles
import zakadabar.lib.accounts.data.LogoutAction
import zakadabar.lib.i18n.browser.LocaleCrud
import zakadabar.lib.i18n.browser.TranslationCrud

class SideBar : ZkSideBar() {

    override fun onCreate() {
        super.onCreate()

        ifAnonymous {
            + item<Login>()
        }

        ifNotAnonymous {
            + item<MembershipAccountCrud>()
            + item<DocumentCrud>()

        }

        withRole(appRoles.securityOfficer) {
            + group(localized<AccountSecure>()) {
                + item<AccountSecure>()
                + item<Roles>()
            }
            + group(localized<TranslationCrud>()) {
                + item<LocaleCrud>()
                + item<TranslationCrud>()
            }
        }

        ifNotAnonymous {
            + item<Account>()
            + item(strings.logout) {
                io {
                    LogoutAction().execute()
                    window.location.href = "/"
                }
            }
        }
    }

}



