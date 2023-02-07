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
    listOf(appStyles.pageElementStyle)
) {

    fun createTable() = zke(appStyles.cards) {
        testData.forEach { + ContributorCard(it) }
    }

    class ContributorCard(
        var bo: ContributorBo
    ) : ZkElement() {

        override fun onCreate() {
            + appStyles.card
            + grid {
                + appStyles.width30vw
                + column {
                    + appStyles.contributorImgDiv
                    + image("/man.png", appStyles.contributorPicture)
                }
                + column {
                    + appStyles.contributorTextDiv
                    + row(appStyles.paddingLeft2vw) { + zke { + bo.name } css appStyles.fontSize2vw }
                    + row(appStyles.paddingLeft2vw) { + zke { + bo.position } css appStyles.fontSize1dot5vw }
                    + row(appStyles.paddingLeft2vw) { + p { + ! bo.introduction } css appStyles.fontSize1dot2vw }
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
