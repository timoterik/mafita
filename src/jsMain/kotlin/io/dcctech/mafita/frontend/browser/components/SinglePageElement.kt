/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.components


import kotlinx.browser.window
import zakadabar.core.browser.ZkElement
import zakadabar.core.browser.application.application
import zakadabar.core.resource.css.ZkCssStyleRule


open class SinglePageElement(
    var url: String? = null,
    val elements: List<PageElementData>,
    val pageCSSs: List<ZkCssStyleRule>? = null
) : ZkElement() {

    override fun onCreate() {

        url?.let { element.id = "#$it" }

        elements.forEach { e ->

            on(window, application.navStateChangeEvent) { event ->
                console.log(window.location.hash, element.id)
                if (window.location.hash == element.id) {
                    element.scrollIntoView()
                }
            }

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

                e.component?.let { (component, listOfCss) ->
                    + zke {
                        + component
                        listOfCss?.forEach { css -> + css }
                    }
                }
            }
        }
    }
}