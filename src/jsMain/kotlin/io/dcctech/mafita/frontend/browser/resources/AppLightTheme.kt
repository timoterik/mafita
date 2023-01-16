/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.resources

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
    // -------------------------------------------------------------------------
    // Customize style variables
    // -------------------------------------------------------------------------

//    override fun onResume() {
//        super.onResume()
//
//        with(zkTitleBarStyles) {
//            appHandleBackground = "green"
//        }
//    }

}