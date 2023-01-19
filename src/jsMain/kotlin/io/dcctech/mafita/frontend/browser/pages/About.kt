/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages


import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.layout.ZkFullScreenLayout
import zakadabar.core.browser.layout.zkScrollBarStyles
import zakadabar.core.browser.page.ZkPage
import zakadabar.core.resource.css.Position
import zakadabar.lib.blobs.browser.blobStyles

object About : ZkPage(ZkFullScreenLayout, zkScrollBarStyles.hideScrollBar) {

    override fun onCreate() {

        setAppTitle = false
        + appStyles.homePageStyleOne

        + row {
            + grid {
                width = "200%" //Todo it looks very ugly
                + Position.relative
                + image("/about_1.png", blobStyles.image)
                + h4 {
                    + appStyles.aboutPageTitleText
                    + strings.about
                }
                + p {
                    + appStyles.aboutPageText
                    + strings.aboutText
                }
            }
            + grid {
                + image("/about_with_team.png", blobStyles.image)
            }
        }
    }
}