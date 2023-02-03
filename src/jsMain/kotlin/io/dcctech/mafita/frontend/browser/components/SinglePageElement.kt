/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.components


import zakadabar.core.browser.layout.ZkFullScreenLayout
import zakadabar.core.browser.layout.zkScrollBarStyles
import zakadabar.core.browser.page.ZkPage
import zakadabar.core.resource.css.ZkCssStyleRule


open class SinglePageElement(
    val elements: List<PageElementData>,
    val pageCSSs: List<ZkCssStyleRule>? = null
) : ZkPage(ZkFullScreenLayout, zkScrollBarStyles.hideScrollBar) {

    override fun onCreate() {
        setAppTitle = false

        elements.forEach { e ->

            pageCSSs?.forEach { css ->
                + css
            }

            e.elementStyles?.forEach { css ->
                + css
            }

            e.image?.let { (img, imgCss, zkeCss) ->
                + zke {
                    + image(img, imgCss)
                    zkeCss?.let { + it }
                }
            }

            e.title?.let { (title, listOfCss) ->
                + zke {
                    + h4 {
                        + title
                    }
                    listOfCss?.forEach { css -> + css }
                }
            }

            e.text?.let { (text, listOfCss) ->
                + zke {
                    ! text
                    listOfCss?.forEach { css -> + css }
                }
            }

            e.image2?.let { (img, imgCss, zkeCss) ->
                + zke {
                    + image(img, imgCss)
                    zkeCss?.let { + it }
                }
            }
        }
    }
}