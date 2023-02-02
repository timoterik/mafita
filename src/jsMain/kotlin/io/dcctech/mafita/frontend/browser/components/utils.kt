/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.components

import kotlinx.browser.window
import zakadabar.core.browser.button.ZkButton
import zakadabar.core.resource.ZkFlavour

fun btnWithoutBg(text: String, onClick: () -> Unit) = ZkButton(text, flavour = ZkFlavour.Custom, onClick = onClick, fill = false, border = false, capitalize = false)

fun openURL(url: String, target: String = "_blank") = window.open(url, target)

