/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages



import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.layout.ZkFullScreenLayout
import zakadabar.core.browser.page.ZkPathPage
import zakadabar.core.resource.ZkColors
import zakadabar.core.resource.css.AlignItems
import zakadabar.core.resource.css.vh
import zakadabar.core.resource.css.vw
import zakadabar.lib.blobs.browser.blobStyles

object Welcome : ZkPathPage(ZkFullScreenLayout) {

    override fun onCreate() {

        + column {
            + AlignItems.center
            height = 30.vh


        }
        setAppTitle = false
        height = 90.vw
        this.style { background = ZkColors.white }

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