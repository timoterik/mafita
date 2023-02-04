/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages.landingPage

import io.dcctech.mafita.frontend.browser.components.MafitaHeader
import zakadabar.core.browser.layout.ZkFullScreenLayout
import zakadabar.core.browser.layout.zkDefaultLayoutStyles
import zakadabar.core.browser.page.ZkPage

object Home : ZkPage(ZkFullScreenLayout, zkDefaultLayoutStyles.popupSideBarContainer) {

    override fun onCreate() {
        super.onCreate()
        + MafitaHeader()
        + Welcome
        + About
        + ClubAndCru
        + CampNCommunityService
        + Donation
//        + Contributors
//        + MafitaFooter()

    }
}