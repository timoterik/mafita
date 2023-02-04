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

    val homepageTextColorTwo by cssClass {
        color = mafitaTheme.homepageTextColorTwo
    }

    val fontSize2vw by cssClass {
        fontSize = 2.vw
    }

    val fontSize1dot5vw by cssClass {
        fontSize = 1.5.vw
    }

    val fontSize1dot2vw by cssClass {
        fontSize = 1.2.vw
    }

    val width33vw by cssClass {
        width = 33.vw
    }

    val width30vw by cssClass {
        width = 30.vw
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
//        backgroundColor = mafitaTheme.homepageBgColorTwo
        color = mafitaTheme.homepageTextColorTwo
    }

    val clubNCruPage by cssClass {
        height40VW
    }

    val donationPage by cssClass {
        backgroundImage = "url(/clubNCruBg.jpg)" //FIXME should change
    }

    val pageElementStyle by cssClass {
        + Display.grid
        backgroundColor = theme.backgroundColor
    }

    val welcomePageSlogan by cssClass {
        gridColumnStart = 4
        gridColumnEnd = 6
        gridRowStart = 2
        gridRowEnd = 2
        + JustifySelf.center
    }

    val welcomePageLogo by cssClass {
        gridColumnStart = 4
        gridColumnEnd = 6
        gridRowStart = 3
        gridRowEnd = 6
        + JustifySelf.center
    }

    val welcomePageImg by cssClass {
        gridColumnStart = 1
        gridColumnEnd = 3
        gridRowStart = 1
        gridRowEnd = 6
        + JustifySelf.center
    }

    val aboutFirstImgDiv by cssClass {
        gridColumnStart = 1
        gridColumnEnd = 4
        gridRowStart = 1
        gridRowEnd = 6
    }

    val aboutSecondImgDiv by cssClass {
        gridColumnStart = 4
        gridColumnEnd = 5
        gridRowStart = 1
        gridRowEnd = 6
    }

    val aboutSecondImg by cssClass {
        maxWidth = 100.percent
        maxHeight = 100.percent
        borderRadius = "20% 80% 75% 25% / 70% 39% 61% 30% "
    }

    val aboutThirdImgDiv by cssClass {
        gridColumnStart = 4
        gridColumnEnd = 6
        gridRowStart = 3
        gridRowEnd = 6
    }

    val aboutTitle by cssClass {
        gridColumnStart = 1
        gridColumnEnd = 1
        gridRowStart = 1
        gridRowEnd = 1
        + AlignSelf.end
    }

    val aboutText by cssClass {
        gridColumnStart = 1
        gridColumnEnd = 4
        gridRowStart = 2
        gridRowEnd = 6
    }

    val clubAndCruImgDiv by cssClass {
        gridColumnStart = 1
        gridColumnEnd = 6
        gridRowStart = 1
        gridRowEnd = 6
    }

    val clubAndCruImg by cssClass {
        borderRadius = "0% 100% 0% 100% / 100% 35% 65% 0%"
        maxWidth = 100.percent
        maxHeight = 100.percent
    }

    val cruTitle by cssClass {
        gridColumnStart = 4
        gridColumnEnd = 4
        gridRowStart = 3
        gridRowEnd = 3
        + AlignSelf.end
        + TextAlign.right
    }

    val cruText by cssClass {
        gridColumnStart = 3
        gridColumnEnd = 5
        gridRowStart = 4
        gridRowEnd = 6
        + TextAlign.right

    }

    val fridayClubTitle by cssClass {
        gridColumnStart = 2
        gridColumnEnd = 2
        gridRowStart = 1
        gridRowEnd = 1
        + AlignSelf.end
    }

    val fridayClubText by cssClass {
        gridColumnStart = 2
        gridColumnEnd = 3
        gridRowStart = 2
        gridRowEnd = 4
    }

    val campTitle by cssClass {
        gridColumnStart = 1
        gridColumnEnd = 1
        gridRowStart = 1
        gridRowEnd = 1
        + AlignSelf.center
    }

    val campText by cssClass {
        gridColumnStart = 1
        gridColumnEnd = 4
        gridRowStart = 2
        gridRowEnd = 4
    }

    val communityServiceTitle by cssClass {
        gridColumnStart = 4
        gridColumnEnd = 5
        gridRowStart = 3
        gridRowEnd = 3
        + TextAlign.right

    }

    val communityServiceText by cssClass {
        gridColumnStart = 4
        gridColumnEnd = 5
        gridRowStart = 4
        gridRowEnd = 6
        + TextAlign.right
    }

    val campCommunityServiceImg by cssClass {
        gridColumnStart = 2
        gridColumnEnd = 4
        gridRowStart = 4
        gridRowEnd = 6
    }

    val cards by cssClass {
        gridTemplateColumns = "repeat( auto-fit, minmax( 250px, 1fr ) )"
        gap = 20.px
        + AlignSelf.stretch
    }

    val card by cssClass {
        + Display.flex
        + FlexDirection.row
        + JustifyContent.center
        + AlignSelf.stretch
    }

    val cardInner by cssClass {
        width = 250.px
        border = theme.border
        borderRadius = 2.px
    }

    val cardTitle by cssClass {
        fontSize = 18.px
        padding = 20.px
        fontWeight = 500.weight
        borderBottom = theme.border
    }

    val donationTitle by cssClass {
        gridColumnStart = 1
        gridColumnEnd = 2
        gridRowStart = 1
        gridRowEnd = 1
        + AlignSelf.end
    }

    val donationText1 by cssClass {
        gridColumnStart = 1
        gridColumnEnd = 5
        gridRowStart = 2
        gridRowEnd = 6
    }
    val donationText2 by cssClass {
        gridColumnStart = 7
        gridColumnEnd = 12
        gridRowStart = 2
        gridRowEnd = 4
    }

    val donationButton by cssClass {
        gridColumnStart = 9
        gridColumnEnd = 9
        gridRowStart = 4
        gridRowEnd = 4
    }

    val donationImgDiv by cssClass {
        gridColumnStart = 1
        gridColumnEnd = 12
        gridRowStart = 1
        gridRowEnd = 6
    }


    val cardText by cssClass {
        padding = 20.px
    }

    val fivePanels by cssClass {
        display = "grid"
        width = "100%"
        overflow = "auto"
        gridTemplateColumns = "1fr 1fr 1fr 1fr 1fr"
        gap = 4.px
    }

    val sixPanels by cssClass {
        display = "grid"
        width = "100%"
        overflow = "auto"
        gridTemplateColumns = "1fr 1fr 1fr 1fr 1fr 1fr"
        gap = 4.px
    }

    val threeRows by cssClass {
        display = "grid"
        width = "100%"
        overflow = "auto"
        gridTemplateColumns = "1fr 1fr 1fr"
        gap = 4.px
    }

    val twoRows by cssClass {
        display = "grid"
        height = "100%"
        overflow = "auto"
        gridTemplateRows = "1fr 1fr"
        gap = 4.px
    }

    val row by cssClass {
        gridTemplateRows = "1fr"
    }

    val grid by cssClass {
        display = "grid"
        height = "100%"
    }

    val twoColumns by cssClass {
        gridTemplateColumns = "1fr 1fr"
        gap = 4.px
    }

    val height40VW by cssClass {
        height = 40.vw
    }

    val height30VW by cssClass {
        height = 30.vw
    }

    val height25VW by cssClass {
        height = 25.vw
    }

    val paddingLeft2vw by cssClass {
        paddingLeft = 2.vw
    }

    val paddingRight2vw by cssClass {
        paddingRight = 2.vw
    }

    val minusMarginTop2vw by cssClass {
        marginTop = (- 2).vw
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