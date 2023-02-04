/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages.landingPage


import io.dcctech.mafita.frontend.browser.components.PageElementData
import io.dcctech.mafita.frontend.browser.components.SinglePageElement
import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.resources.strings
import zakadabar.lib.blobs.browser.blobStyles


object About : SinglePageElement(
    listOf(
        PageElementData(
            title = Pair(strings.about, appStyles.let { listOf(it.fontSize2vw, it.aboutTitle, it.paddingLeft2vw) }),
            text = Pair(strings.aboutText, appStyles.let { listOf(it.fontSize1dot2vw, it.aboutText, it.paddingLeft2vw, it.minusMarginTop2vw) }),
            image = Triple("/about_1.png", blobStyles.image, appStyles.aboutFirstImgDiv),
            image2 = Triple("/about_team.jpg", appStyles.aboutSecondImg, appStyles.aboutSecondImgDiv),
            elementStyles = appStyles.let { listOf(it.pageElementStyle, it.homePageStyleTwo) }
        ),
        PageElementData(
            image2 = Triple("/about_2.png", blobStyles.image, appStyles.aboutThirdImgDiv),
        )
    )
)