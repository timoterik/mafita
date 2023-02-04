/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages.landingPage


import io.dcctech.mafita.data.ContributorBo
import io.dcctech.mafita.frontend.browser.components.PageElementData
import io.dcctech.mafita.frontend.browser.components.SinglePageElement
import io.dcctech.mafita.frontend.browser.pages.landingPage.Contributors.createTable
import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.ZkElement
import zakadabar.core.data.EntityId


object Contributors : SinglePageElement(
    listOf(
        PageElementData(
            title = Pair(strings.contributors, appStyles.let { listOf(it.fontSize2vw, it.contributorsTitle, it.paddingLeft2vw, it.paddingRight2vw) }),
        ),
        PageElementData(
            component = Pair(createTable(), listOf(appStyles.cards))
        )
    ),
    appStyles.let { listOf(it.pageElementStyle, it.homePageStyleTwo) }
) {

    fun createTable() = zke {
        + appStyles.cards
        testData.forEach { + ContributorCard(it) }
    }

    class ContributorCard(
        var bo: ContributorBo
    ) : ZkElement() {

        override fun onCreate() {
            + zke(appStyles.cardInner) {
                + zke {
                    + appStyles.contributorImgDiv
                    + image("/man.png", appStyles.contributorPicture)
                }
                + zke {
                    + appStyles.contributorTextDiv
                    + zke(appStyles.cardTitle) { + bo.name }
                    + zke(appStyles.cardTitle) { + bo.position }
                    + zke { + p { + ! bo.introduction } }
                }
            }
        }
    }
}


val testData = listOf(
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
