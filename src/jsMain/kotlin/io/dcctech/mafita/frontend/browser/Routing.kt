/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser

import io.dcctech.mafita.frontend.browser.pages.Dashboard
import io.dcctech.mafita.frontend.browser.pages.DocumentCrud
import io.dcctech.mafita.frontend.browser.pages.MailCrud
import io.dcctech.mafita.frontend.browser.pages.OAuthLogin
import io.dcctech.mafita.frontend.browser.pages.landingPage.Contributors
import io.dcctech.mafita.frontend.browser.pages.landingPage.Donation
import io.dcctech.mafita.frontend.browser.pages.landingPage.Home
import zakadabar.core.browser.application.ZkAppRouting

class Routing : ZkAppRouting(DefaultLayout, Home) {

    init {
        zakadabar.lib.accounts.browser.install(this)
        zakadabar.lib.i18n.browser.install(this)
        + Home
        + DocumentCrud()
        + MailCrud()
//        + Welcome
//        + About
        + Dashboard
        + OAuthLogin()
//        + ClubAndCru
//        + CampNCommunityService
        + Donation
        + Contributors

    }

}