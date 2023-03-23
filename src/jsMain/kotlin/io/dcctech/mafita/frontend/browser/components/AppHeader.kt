/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.components

import io.dcctech.mafita.frontend.browser.resources.AppDarkTheme
import io.dcctech.mafita.frontend.browser.resources.AppLightTheme
import zakadabar.core.browser.theme.ZkThemeRotate
import zakadabar.core.resource.ZkIcons
import zakadabar.softui.browser.titlebar.SuiAppHeader

class AppHeader(
    onToggleSideBar: () -> Unit = { },
) : SuiAppHeader(onToggleSideBar) {

    override fun onCreate() {
        super.onCreate()

        globalElements += ZkThemeRotate(
            ZkIcons.darkMode to AppDarkTheme(),
            ZkIcons.lightMode to AppLightTheme()
        )
    }

}