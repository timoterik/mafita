/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser

import io.dcctech.mafita.frontend.browser.components.AppHeader
import zakadabar.softui.browser.layout.SuiDefaultLayout

object DefaultLayout : SuiDefaultLayout() {
    override fun onCreate() {
        super.onCreate()

        header = AppHeader()
        sideBar = SideBar()
    }
}
