/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.resources

import zakadabar.core.resource.ZkTheme
import zakadabar.core.resource.theme

val mafitaTheme: MafitaTheme
    get() = theme as MafitaTheme

interface MafitaTheme : ZkTheme {
    val mafitaColor: String
    val mafitaLogoSVGColor: String
    val homepageBgColorOne: String
    val homepageBgColorTwo: String
    val homepageTextColorOne: String
    val homepageTextColorTwo: String
}