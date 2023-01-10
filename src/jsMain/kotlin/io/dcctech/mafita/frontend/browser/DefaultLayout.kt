/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser

import zakadabar.softui.browser.layout.SuiDefaultLayout
import io.dcctech.mafita.frontend.browser.components.AppHeader

object DefaultLayout : SuiDefaultLayout() {
    override fun onCreate() {
        super.onCreate()
        header = AppHeader()
        sideBar = SideBar()
    }
}
