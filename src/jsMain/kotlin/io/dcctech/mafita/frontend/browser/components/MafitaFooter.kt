/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.components

import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.ZkElement
import zakadabar.lib.blobs.browser.blobStyles

class MafitaFooter : ZkElement() {

    override fun onCreate() {
        super.onCreate()

        + row {
            h4 {
                + strings.contact
            } css appStyles.homePageStyleTwo
            + column { strings.organizationName }
            + column {
                + h3 { + strings.mafitaFullName }
            }
            + column {
                + p { + "${strings.organizationAddress}: ${strings.mafitaAddress}" }
                + p { + "${strings.corporateTaxNumber}: ${strings.mafitaTaxNumber}" }
                + p { + "${strings.bankAccountNumberOfOrganization}: ${strings.bankAccountNumberOfMafita}" }
            }
            + column {
                + zke {
                    + image("/facebook.png", blobStyles.image)
                }.on("click") { openURL(strings.mafitaFacebookUrl) }
                + zke {
                    + image("/instagram.png", blobStyles.image)
                }.on("click") { openURL(strings.mafitaInstagramUrl) }
            }
            + column {
                + zke { + "${strings.phone}: ${strings.mafitaPhoneNumber}" }.on("click") {
                    openURL("tel:${strings.mafitaPhoneNumber}")
                }
                + zke { + "${strings.email}: ${strings.mafitaEmailAddress}" }.on("click") {
                    openURL("mailto:${strings.mafitaEmailAddress}")
                }

            }
        }
    }
}