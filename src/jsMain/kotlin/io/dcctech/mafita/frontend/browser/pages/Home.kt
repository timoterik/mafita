/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages

import zakadabar.core.browser.page.ZkPage
import zakadabar.core.browser.util.plusAssign
import io.dcctech.mafita.frontend.browser.resources.appStyles

object Home : ZkPage() {

    override fun onCreate() {
        classList += appStyles.home

        + "This is the home page of your application. Click on \"Login\" (on the left) and use \"so\" - \"so\" to log in."
    }

}