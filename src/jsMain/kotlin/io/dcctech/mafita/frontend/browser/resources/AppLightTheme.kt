/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.resources

import zakadabar.core.browser.sidebar.zkSideBarStyles
import zakadabar.core.browser.titlebar.zkTitleBarStyles
import zakadabar.core.resource.ZkColors
import zakadabar.softui.browser.theme.SuiLightTheme
import zakadabar.softui.browser.theme.styles.suiLayoutStyles


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


    override var infoPair: String = mafitaColor
    override fun onResume() {
        super<SuiLightTheme>.onResume()

        with(zkSideBarStyles) {
            textColor = mafitaColor
            backgroundColor = ZkColors.white
        }

        with(zkTitleBarStyles) {
            appTitleBarText = mafitaColor
        }


        with(suiLayoutStyles) {
//            headerBackground = ZkColors.white
//            with(sideBarContainer){
//                height = 100.px
//                width = 100.percent
//            }
        }


        with(singlePageLayoutStyles) {
            headerColor = backgroundColor
        }
    }
}