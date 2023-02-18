/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.resources

import zakadabar.core.resource.css.*

val singlePageLayoutStyles by cssStyleSheet(SinglePageLayoutStyles())

open class SinglePageLayoutStyles : ZkCssStyleSheet() {

    open var headerColor = theme.backgroundColor
    fun init() {
        html
        body
        beforeNAfter
    }

    open val html by cssRule("html") {
        styles["scroll-behavior"] = "smooth"
    }

    open val body by cssRule("body") {
        fontFamily = "arial"
        fontSize = 18.px
        margin = 0.px
        background = headerColor
    }

    open val beforeNAfter by cssRule("*, *::before, *::after") {
        styles["-webkit-box-sizing"] = "border-box"
        styles["-moz-box-sizing"] = "border-box"
        styles["-ms-box-sizing"] = "border-box"
        styles["box-sizing"] = "border-box"
    }

    open val header by cssClass {
        + Position.fixed
        width = 100.percent
        top = 0.px
        left = 0.px
        zIndex = "10"
        padding = "15px 0"
        background = headerColor

        on(" .container") {
            + AlignItems.center
        }
    }

    open val container by cssClass {
        + Display.flex
        + JustifyContent.spaceBetween
        width = 100.percent
        maxWidth = 1200.px
        styles["margin-inline"] = "auto"
    }

    open val wrapper by cssClass {

    }

}