/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.components

import zakadabar.core.browser.ZkElement
import zakadabar.core.browser.theme.ZkThemeRotate
import zakadabar.core.resource.ZkIcons
import io.dcctech.mafita.frontend.browser.resources.AppDarkTheme
import io.dcctech.mafita.frontend.browser.resources.AppLightTheme

class HeaderActions : ZkElement() {

    override fun onCreate() {
        + ZkThemeRotate(
            ZkIcons.darkMode to AppDarkTheme(),
            ZkIcons.lightMode to AppLightTheme()
        )
    }

}