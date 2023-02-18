/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages.landingPage

import io.dcctech.mafita.frontend.browser.components.SinglePageLayout
import io.dcctech.mafita.frontend.browser.resources.singlePageLayoutStyles
import zakadabar.core.browser.page.ZkPage

object Home : ZkPage(SinglePageLayout, singlePageLayoutStyles.wrapper) {
    override fun onCreate() {
        super.onCreate()

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