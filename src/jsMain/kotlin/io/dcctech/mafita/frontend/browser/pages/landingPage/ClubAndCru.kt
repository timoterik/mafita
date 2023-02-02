/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages.landingPage

import io.dcctech.mafita.frontend.browser.components.PageElementData
import io.dcctech.mafita.frontend.browser.components.SinglePageElement
import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.resources.strings

object ClubAndCru : SinglePageElement(
    listOf(
        PageElementData(
            image = Triple("/clubNCruBg.jpg", appStyles.clubAndCruImg, appStyles.clubAndCruImgDiv)
        ),
        PageElementData(
            title = Pair(strings.fridayClub, appStyles.let { listOf(it.fontSize2vw, it.fridayClubTitle, it.paddingLeft2vw) }),
            text = Pair(strings.fridayClubText, appStyles.let { listOf(it.fontSize1dot2vw, it.width30vw, it.fridayClubText, it.paddingLeft2vw) }),
        ),
        PageElementData(
            title = Pair(strings.camp, appStyles.let { listOf(it.fontSize2vw, it.campTitle) }),
            text = Pair(strings.campText, appStyles.let { listOf(it.fontSize1dot2vw, it.width30vw, it.campText) }),
        )
    ),
    appStyles.let { listOf(it.pageElementStyle, it.homePageStyleTwo) }
)