/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages

import io.dcctech.mafita.frontend.browser.components.MafitaHeader
import zakadabar.core.browser.layout.ZkFullScreenLayout
import zakadabar.core.browser.page.ZkPathPage

object Home : ZkPathPage(ZkFullScreenLayout) {

    override fun onCreate() {
        super.onCreate()
        + MafitaHeader()

        + row {
            + Welcome
        }
        + row {
            + About
        }
    }
}