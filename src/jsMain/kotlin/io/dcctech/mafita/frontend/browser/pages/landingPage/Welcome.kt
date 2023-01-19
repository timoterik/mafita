/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages.landingPage


import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.layout.ZkFullScreenLayout
import zakadabar.core.browser.layout.zkScrollBarStyles
import zakadabar.core.browser.page.ZkPage
import zakadabar.core.resource.css.vh
import zakadabar.lib.blobs.browser.blobStyles

object Welcome : ZkPage(ZkFullScreenLayout, zkScrollBarStyles.hideScrollBar) {

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