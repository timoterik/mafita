/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages.landingPage


import io.dcctech.mafita.frontend.browser.components.PageElementData
import io.dcctech.mafita.frontend.browser.components.SinglePageElement
import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.button.ZkButton
import zakadabar.core.browser.toast.toastSuccess
import zakadabar.core.resource.ZkFlavour
import zakadabar.lib.blobs.browser.blobStyles

object Donation : SinglePageElement(
    listOf(
        PageElementData(
            image = Triple("/clubNCruBg.jpg", blobStyles.image, appStyles.donationImgDiv)
        ),
        PageElementData(
            title = Pair(strings.donationOnePercent, appStyles.let { listOf(it.fontSize2vw, it.donationTitle, it.paddingLeft2vw, it.paddingRight2vw) }),
            text = Pair(strings.donationText1, appStyles.let { listOf(it.fontSize1dot2vw, it.donationText1, it.paddingLeft2vw, it.paddingRight2vw) }),
        ),
        PageElementData(
            text = Pair(strings.donationText2, appStyles.let { listOf(it.fontSize1dot2vw, it.donationText2, it.paddingRight2vw, it.paddingLeft2vw) }),
            component = Pair(ZkButton(strings.donation, ZkFlavour.Primary) { toastSuccess { "You clicked on a button!" } }, appStyles.let { listOf(it.fontSize2vw, it.donationButton) })
        )
    ),
    appStyles.let { listOf(it.pageElementStyle, it.homePageStyleTwo) }
)