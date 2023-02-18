/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages.landingPage


import io.dcctech.mafita.frontend.browser.components.PageElementData
import io.dcctech.mafita.frontend.browser.components.SinglePageElement
import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.resources.strings


class Welcome : SinglePageElement(
    url = strings.applicationName.lowercase(),
    listOf(
        PageElementData(
            title = Pair(strings.slogan, appStyles.let { listOf(it.fontSize2vw, it.mafitaColor, it.welcomePageSlogan) }),
            image = Triple("/welcomePicture.png", appStyles.height40VW, appStyles.welcomePageImg),
            image2 = Triple("/favicon.png", appStyles.height25VW, appStyles.welcomePageLogo),
            elementStyles = appStyles.let { listOf(it.pageElementStyle, it.homePageStyleOne) }
        )
    )
)
