/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.resources

import zakadabar.core.browser.layout.zkScrollBarStyles
import zakadabar.core.browser.sidebar.zkSideBarStyles
import zakadabar.core.browser.titlebar.zkTitleBarStyles
import zakadabar.core.resource.ZkColors
import zakadabar.core.util.alpha
import zakadabar.softui.browser.theme.SuiLightTheme

class AppLightTheme : SuiLightTheme() {

    companion object {
        const val NAME = "app-light"
    }

    override val name = NAME

    // -------------------------------------------------------------------------
    // Customize theme variables
    // -------------------------------------------------------------------------

    override var primaryColor = "#DF6107"
    var homepageBgColorOne = ZkColors.white
    var homepageBgColorTwo = ZkColors.black
    var homepageTextColorOne = ZkColors.black
    var homepageTextColorTwo = ZkColors.white

    override var secondaryColor = "white"


    override fun onResume() {
        super.onResume()

        with(zkScrollBarStyles) {
            thumbColor = textColor.alpha(0.5)
            trackColor = backgroundColor
        }

        with(zkSideBarStyles) {
            backgroundColor = primaryColor
            hoverTextColor = ZkColors.white
            textColor = primaryColor
            fontSize = "90%"
            sectionBackgroundColor = ZkColors.white.alpha(0.1)
            sectionBorderColor = ZkColors.white.alpha(0.5)
            sectionTextColor = ZkColors.white
        }

        with(zkTitleBarStyles) {
            appHandleBackground = blockBackgroundColor
            appHandleText = textColor
            appHandleBorder = "1px solid $primaryColor"
            appTitleBarBackground = blockBackgroundColor
            appTitleBarBorder = appHandleBorder
        }

    }
}