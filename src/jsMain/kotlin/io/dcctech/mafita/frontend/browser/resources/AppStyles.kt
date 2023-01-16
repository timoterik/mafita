/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.resources

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

    val navCol by cssClass {
        + JustifyContent.center
        + AlignItems.center
        width = "8%"
    }

//    val wave by cssClass {
//     + Position.relative
//        height = 70.px
//        width + 600.px
//        background = "#e0efe3"
//
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
//
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