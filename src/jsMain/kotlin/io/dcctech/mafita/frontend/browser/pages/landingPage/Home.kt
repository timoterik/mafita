/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages.landingPage

import io.dcctech.mafita.frontend.browser.DefaultLayout
import io.dcctech.mafita.frontend.browser.resources.appStyles
import zakadabar.core.browser.page.ZkPage
import zakadabar.core.browser.util.plusAssign

object Home : ZkPage(DefaultLayout) {
    override fun onCreate() {
        super.onCreate()
        classList += appStyles.landing

        + Welcome()
        + About()
        + Club()
        + Cru()
        + Camp()
        + CommunityService()
        + Donation()
        + Contributors()
        + Footer()

    }
}