/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.resources

import zakadabar.core.browser.layout.zkScrollBarStyles
import zakadabar.core.browser.sidebar.zkSideBarStyles
import zakadabar.core.browser.titlebar.zkTitleBarStyles
import zakadabar.core.resource.ZkColors
import zakadabar.core.util.alpha
import zakadabar.softui.browser.theme.SuiDarkTheme

class AppDarkTheme : SuiDarkTheme(), MafitaTheme {

    companion object {
        const val NAME = "app-dark"
    }

    override val name = NAME

    override var primaryColor = "#DF6107"
    override var homepageBgColorOne = ZkColors.black
    override var homepageBgColorTwo = ZkColors.white
    override var homepageTextColorOne = ZkColors.white
    override var homepageTextColorTwo = ZkColors.black
    override var secondaryColor = "black"

    override fun onResume() {
        super<SuiDarkTheme>.onResume()

        with(zkScrollBarStyles) {
            thumbColor = textColor.alpha(0.5)
            trackColor = backgroundColor
        }

        with(zkSideBarStyles) {
            backgroundColor = primaryColor
            hoverTextColor = ZkColors.white
            textColor = ZkColors.white
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