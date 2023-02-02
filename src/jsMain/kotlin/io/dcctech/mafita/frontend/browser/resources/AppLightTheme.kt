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


class AppLightTheme : SuiLightTheme(), MafitaTheme {

    companion object {
        const val NAME = "app-light"
    }

    override val name = NAME

    // -------------------------------------------------------------------------
    // Customize theme variables
    // -------------------------------------------------------------------------

//    override var primaryColor = "#DF6107"

    override var mafitaColor = "#DF6107"
    override val mafitaLogoSVGColor = "white"
    override var homepageBgColorOne = ZkColors.white
    override var homepageBgColorTwo = ZkColors.black
    override var homepageTextColorOne = ZkColors.black
    override var homepageTextColorTwo = ZkColors.white

    override var backgroundColor: String = ZkColors.white
    override fun onResume() {
        super<SuiLightTheme>.onResume()

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
            appTitleBarText = mafitaTheme.mafitaColor
            appHandleBackground = blockBackgroundColor
            appHandleText = textColor
            appHandleBorder = "1px solid ${mafitaTheme.mafitaColor}"
            appTitleBarBackground = blockBackgroundColor
            appTitleBarBorder = appHandleBorder
        }

    }
}