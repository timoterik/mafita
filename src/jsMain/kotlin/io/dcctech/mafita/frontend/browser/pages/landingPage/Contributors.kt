/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages.landingPage


import io.dcctech.mafita.data.ContributorBo
import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.ZkElement
import zakadabar.core.browser.layout.ZkFullScreenLayout
import zakadabar.core.browser.layout.zkScrollBarStyles
import zakadabar.core.browser.page.ZkPage
import zakadabar.core.browser.util.plusAssign
import zakadabar.core.data.EntityId
import zakadabar.lib.blobs.browser.blobStyles

object Contributors : ZkPage(ZkFullScreenLayout, zkScrollBarStyles.hideScrollBar) {

    override fun onCreate() {

        setAppTitle = false
        + appStyles.homePageStyleOne

        + row {
            + h4 {
                + strings.contributors
            } //css appStyles.textLeft css appStyles.top5vw

            + grid(appStyles.cards) {
                testData.forEach { + ContributorCard(it) }
            }
        } css appStyles.donationPage
    }

    class ContributorCard(
        var bo: ContributorBo
    ) : ZkElement() {

        override fun onCreate() {
            classList += appStyles.card
            + div(appStyles.cardInner) {
                + row {
                    + column {
                        + div(appStyles.cardTitle) { + image("/man.png", blobStyles.image) }
                    }
                    + column {
                        + div(appStyles.cardTitle) {
                            + bo.name
                        }
                        + div(appStyles.cardTitle) { + bo.position }
                    }
                }
                + row {
                    + p { + bo.introduction }
                }

            }
        }
    }
}

val testData = listOf<ContributorBo>(
    ContributorBo(
        EntityId(0),
        "Rose Lyman",
        "",
        "CEO",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum quis lacinia dolor. Mauris eleifend ligula sed malesuada pharetra. Vestibulum blandit odio ante, a congue magna vehicula ac. Proin erat purus, volutpat ac velit et, placerat blandit."
    ),
    ContributorBo(
        EntityId(0),
        "Sam McGrath",
        "",
        "Office clerks",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum quis lacinia dolor. Mauris eleifend ligula sed malesuada pharetra. Vestibulum blandit odio ante, a congue magna vehicula ac. Proin erat purus, volutpat ac velit et, placerat blandit."
    ),
    ContributorBo(
        EntityId(0),
        "Ryan Jackson",
        "",
        "Administrative assistant",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum quis lacinia dolor. Mauris eleifend ligula sed malesuada pharetra. Vestibulum blandit odio ante, a congue magna vehicula ac. Proin erat purus, volutpat ac velit et, placerat blandit."
    ),
    ContributorBo(
        EntityId(0),
        "Tracey Gray",
        "",
        "Accounting clerk",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum quis lacinia dolor. Mauris eleifend ligula sed malesuada pharetra. Vestibulum blandit odio ante, a congue magna vehicula ac. Proin erat purus, volutpat ac velit et, placerat blandit."
    ),
    ContributorBo(
        EntityId(0),
        "Sally Vance",
        "",
        "Marketing manager",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum quis lacinia dolor. Mauris eleifend ligula sed malesuada pharetra. Vestibulum blandit odio ante, a congue magna vehicula ac. Proin erat purus, volutpat ac velit et, placerat blandit."
    ),
    ContributorBo(
        EntityId(0),
        "Kylie Dickens",
        "",
        "Voluntary",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum quis lacinia dolor. Mauris eleifend ligula sed malesuada pharetra. Vestibulum blandit odio ante, a congue magna vehicula ac. Proin erat purus, volutpat ac velit et, placerat blandit."
    ),
    ContributorBo(
        EntityId(0),
        "Hannah Hughes",
        "",
        "Voluntary",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum quis lacinia dolor. Mauris eleifend ligula sed malesuada pharetra. Vestibulum blandit odio ante, a congue magna vehicula ac. Proin erat purus, volutpat ac velit et, placerat blandit."
    ),
    ContributorBo(
        EntityId(0),
        "Leonard Howard",
        "",
        "Voluntary",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum quis lacinia dolor. Mauris eleifend ligula sed malesuada pharetra. Vestibulum blandit odio ante, a congue magna vehicula ac. Proin erat purus, volutpat ac velit et, placerat blandit."
    )
)
