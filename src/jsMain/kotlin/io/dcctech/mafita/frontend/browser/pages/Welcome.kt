/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages


import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.layout.ZkFullScreenLayout
import zakadabar.core.browser.page.ZkPathPage
import zakadabar.core.resource.css.vh
import zakadabar.lib.blobs.browser.blobStyles

object Welcome : ZkPathPage(ZkFullScreenLayout) {

    override fun onCreate() {

        setAppTitle = false
        + appStyles.homePageStyleOne

        + row {
            + column {
                + image("/welcomePicture.png", blobStyles.image)
            }

            + column {
                + appStyles.welcomePageLogo
                + row {
                    height = 10.vh
                    + zke { + strings.slogan }
                }
                + row {
                    + image("/favicon.png", blobStyles.image)
                }
            }
        }
    }
}