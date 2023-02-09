/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.components

import io.dcctech.mafita.frontend.browser.DefaultLayout.zke
import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.resources.strings


object MafitaFooter : SinglePageElement(
    listOf(
        PageElementData(
            title = Pair(strings.contact, appStyles.let { listOf(it.fontSize2vw, it.paddingLeft2vw, it.firstGridRow) }),
            text = Pair(strings.mafitaFullName, appStyles.let { listOf(it.fontSize1dot2vw, it.paddingLeft2vw, it.secondGridRow) }),
        ),
        PageElementData(
            component = Pair(zke {
                + p { + "${strings.organizationAddress}: ${strings.mafitaAddress}" }
                + p { + "${strings.corporateTaxNumber}: ${strings.mafitaTaxNumber}" }
                + p { + "${strings.bankAccountNumberOfOrganization}: ${strings.bankAccountNumberOfMafita}" }
            }, appStyles.let { listOf(it.fontSize1dot2vw, it.secondGridRow) })
        ), PageElementData(
            component = Pair(zke {
                + zke {
                    + image("/facebook.png", appStyles.socialMediaIcon)
                }.on("click") { openURL(strings.mafitaFacebookUrl) }
                + zke {
                    + image("/instagram.png", appStyles.socialMediaIcon)
                }.on("click") { openURL(strings.mafitaInstagramUrl) }
            }, listOf(appStyles.socialMediaMainDiv))
        ),
        PageElementData(
            component = Pair(zke {
                + zke { + "${strings.phone}: ${strings.mafitaPhoneNumber}" }.on("click") {
                    openURL("tel:${strings.mafitaPhoneNumber}")
                }
                + zke { + "${strings.email}: ${strings.mafitaEmailAddress}" }.on("click") {
                    openURL("mailto:${strings.mafitaEmailAddress}")
                }
            }, appStyles.let { listOf(it.secondGridRow, it.paddingRight2vw, it.fontSize1dot2vw) })
        )
    ),

    appStyles.let { listOf(it.contactPage) }
)