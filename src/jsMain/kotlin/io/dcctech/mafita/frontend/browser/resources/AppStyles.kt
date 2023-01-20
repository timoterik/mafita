/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.resources

import zakadabar.core.browser.layout.zkScrollBarStyles
import zakadabar.core.resource.css.*

val appStyles by cssStyleSheet(AppStyles())

class AppStyles : ZkCssStyleSheet() {

    // -------------------------------------------------------------------------
    // CSS styles the application
    // -------------------------------------------------------------------------


    val home by cssClass {
        overflowY = "scroll"
        padding = 20.px
    }

    val gridCol2 by cssClass {
        + Position.relative
        + BoxSizing.borderBox
        + Display.grid
        gridTemplateColumns = "max-content max-content"
        gridGap = theme.spacingStep.px
        padding = theme.spacingStep.px
    }

    val nav by cssClass {
        + Display.grid
        gridTemplateColumns = "repeat(12, 1fr)"
        gridAutoRows = 9.vw
        + JustifyContent.center
        + Position.fixed
        top = "0"
        width = "100%"
        backgroundImage = "url(/wave_${mafitaTheme.mafitaLogoSVGColor}.svg)"
        color = mafitaTheme.mafitaColor
    }

    val mafitaColor by cssClass {
        color = mafitaTheme.mafitaColor
    }

    val homePageStyleOne by cssClass {
        zkScrollBarStyles.enabled = false
        backgroundColor = mafitaTheme.homepageBgColorOne
        color = mafitaTheme.homepageTextColorOne
    }

    val paddingTop1andHalf5VW by cssClass {
        paddingTop = 1.5.vw
    }

    val homePageStyleTwo by cssClass {
        backgroundColor = mafitaTheme.homepageBgColorTwo
        color = mafitaTheme.homepageTextColorTwo
    }

    val aboutPageTitleText by cssClass {
        + Position.absolute
        top = 9.vw
        left = 3.vw
        fontSize = 2.vw
        color = mafitaTheme.homepageTextColorTwo

    }

    val aboutPageText by cssClass {
        + Position.absolute
        width = 40.vw
        top = 15.vw
        left = 3.vw
        fontSize = 1.3.vw
        color = mafitaTheme.homepageTextColorTwo
    }

    val welcomePageLogo by cssClass {
        + JustifyContent.center
        + AlignItems.center
        color = mafitaTheme.mafitaColor
    }

//  TODO would look more natural this way

//    val wave by cssClass {
//     + Position.relative
//        height = 70.px
//        width + 600.px
//        background = "#e0efe3"
//        on(":before") {
//            content = ""
//            + Display.block
//            + Position.absolute
//            borderRadius = "100% 50%"
//            width = 340.px
//            height = 80.px
//            backgroundColor = ZkColors.white
//            right = (- 5).px
//            top = 40.px
//        }
//
//        on(":after") {
//            content = ""
//            + Display.block
//            + Position.absolute
//            borderRadius = "100% 50%"
//            width = 300.px
//            height = 70.px
//            backgroundColor = "#e0efe3"
//            left = 0.px
//            top = 27.px
//
//        }
//    }
}