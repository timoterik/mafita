/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.components

import io.dcctech.mafita.frontend.browser.resources.singlePageLayoutStyles
import zakadabar.core.browser.application.ZkAppLayout
import zakadabar.core.browser.layout.zkLayoutStyles
import zakadabar.core.browser.util.minusAssign

object SinglePageLayout : ZkAppLayout("single-page") {

    open val header: Header = Header()

    override fun onCreate() {
        super.onCreate()
        element.classList -= zkLayoutStyles.layout
        element.classList -= zkLayoutStyles.hidden
        singlePageLayoutStyles.init()

        + zke {
            element.id = "single-page-nav"
            + header
        } css singlePageLayoutStyles.header


    }
}
