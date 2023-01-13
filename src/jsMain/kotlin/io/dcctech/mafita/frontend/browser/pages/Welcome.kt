/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages


import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.page.ZkPage
import zakadabar.lib.blobs.browser.blobStyles

object Welcome : ZkPage() {

    override fun onCreate() {

        setAppTitle = false

        + grid {
            + grid {
                + image("/welcomePicture.png", blobStyles.image)
            }

            + grid {
                + strings.slogen
                + image("/favicon.png", blobStyles.image)
            }
        }

    }

}