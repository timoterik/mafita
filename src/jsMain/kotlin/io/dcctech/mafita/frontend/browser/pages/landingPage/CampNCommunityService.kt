/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages.landingPage

import io.dcctech.mafita.frontend.browser.components.PageElementData
import io.dcctech.mafita.frontend.browser.components.SinglePageElement
import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.resources.strings
import zakadabar.lib.blobs.browser.blobStyles


object CampNCommunityService : SinglePageElement(
    listOf(
        PageElementData(
            title = Pair(strings.camp, appStyles.let { listOf(it.fontSize2vw, it.campTitle, it.paddingLeft2vw) }),
            text = Pair(strings.campText, appStyles.let { listOf(it.fontSize1dot2vw, it.campText, it.paddingLeft2vw) }),
//            image = Triple("/about_1.png", blobStyles.image, appStyles.aboutFirstImg),
            image = Triple("/camp.png", blobStyles.image, appStyles.campCommunityServiceImg),
        ),
        PageElementData(
            title = Pair(strings.communityService, appStyles.let { listOf(it.fontSize2vw, it.communityServiceTitle, it.paddingRight2vw) }),
            text = Pair(strings.communityServiceText, appStyles.let { listOf(it.fontSize1dot2vw, it.communityServiceText, it.paddingRight2vw) }),
        )
    ),
    listOf(appStyles.pageElementStyle)
)