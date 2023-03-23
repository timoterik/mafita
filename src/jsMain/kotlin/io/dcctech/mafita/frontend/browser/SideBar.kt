/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser


import io.dcctech.mafita.frontend.browser.components.Header
import io.dcctech.mafita.frontend.browser.pages.DocumentCrud
import io.dcctech.mafita.frontend.browser.pages.MailCrud
import io.dcctech.mafita.frontend.browser.pages.landingPage.Home
import io.dcctech.mafita.resources.strings
import kotlinx.browser.window
import zakadabar.core.authorize.appRoles
import zakadabar.core.browser.ZkElement
import zakadabar.core.browser.sidebar.ZkSideBar
import zakadabar.core.browser.util.io
import zakadabar.core.resource.localized
import zakadabar.lib.accounts.browser.accounts.Account
import zakadabar.lib.accounts.browser.accounts.AccountSecure
import zakadabar.lib.accounts.browser.roles.Roles
import zakadabar.lib.accounts.data.LogoutAction
import zakadabar.lib.i18n.browser.LocaleCrud
import zakadabar.lib.i18n.browser.TranslationCrud

class SideBar : ZkSideBar() {

    val headerBtns = Header()
    override fun onCreate() {
        super.onCreate()


        + item<Home>(text = strings.about, subPath = "#${strings.aboutUrl}")
        + item<Home>(text = strings.fridayClub, subPath = "#${strings.fridayClubUrl}")
        + item<Home>(text = strings.cruSzeged, subPath = "#${strings.cruSzegedUrl}")
        + item<Home>(text = strings.camp, subPath = "#${strings.fridayClubUrl}")
        + item<Home>(text = strings.communityServiceUrl, subPath = "#${strings.communityServiceUrl}")
        + item<Home>(text = strings.donation, subPath = "#${strings.donationUrl}")
        + item<Home>(text = strings.contributors, subPath = "#${strings.contributorsUrl}")
        + item<Home>(text = strings.contact, subPath = "#${strings.contactUrl}")

        ifNotAnonymous {
            + item("") {
                + headerBtns.first<ZkElement>()
            }
            + item<Account>()
            + item<DocumentCrud>()
            withRole(appRoles.securityOfficer) {
                + group(localized<AccountSecure>()) {
                    + item<AccountSecure>()
                    + item<Roles>()
                    + item<MailCrud>()
                }
                + group(localized<TranslationCrud>()) {
                    + item<LocaleCrud>()
                    + item<TranslationCrud>()
                }
            }
            + item(strings.logout) {
                io {
                    LogoutAction().execute()
                    window.location.href = "/"
                }
            }
        }
    }

}



