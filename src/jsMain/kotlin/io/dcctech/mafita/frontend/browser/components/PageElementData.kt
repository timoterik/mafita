/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.components

import zakadabar.core.resource.css.ZkCssStyleRule


data class PageElementData(

    var title: Pair<String, List<ZkCssStyleRule>?>? = null,
    var text: Pair<String, List<ZkCssStyleRule>?>? = null,
    var image: Triple<String, ZkCssStyleRule?, ZkCssStyleRule?>? = null,
    var image2: Triple<String, ZkCssStyleRule?, ZkCssStyleRule?>? = null,
    var elementStyles: List<ZkCssStyleRule>? = null

)
