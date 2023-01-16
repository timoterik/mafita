/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages


import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.layout.ZkFullScreenLayout
import zakadabar.core.browser.page.ZkPathPage
import zakadabar.core.resource.css.vw
import zakadabar.lib.blobs.browser.blobStyles

object About : ZkPathPage(ZkFullScreenLayout) {

    override fun onCreate() {

        setAppTitle = false
        height = 40.vw

        + row {
            + gridAutoColumns
            + column {
                + image("/welcomePicture.png", blobStyles.image)
            }

            + column {
                + strings.slogen
                + image("/favicon.png", blobStyles.image)
            }
        }
    }
}