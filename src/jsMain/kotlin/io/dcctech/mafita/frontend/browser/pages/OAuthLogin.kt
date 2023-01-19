/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages

import kotlinx.browser.window
import zakadabar.core.browser.application.ZkAppRouting
import zakadabar.core.browser.application.application
import zakadabar.core.browser.layout.ZkFullScreenLayout
import zakadabar.core.browser.page.ZkPage
import zakadabar.core.browser.titlebar.zkTitleBarStyles
import zakadabar.core.browser.util.marginBottom
import zakadabar.core.resource.css.AlignItems
import zakadabar.core.resource.css.px
import zakadabar.core.resource.css.vh
import zakadabar.core.resource.css.vw
import zakadabar.core.resource.localizedStrings
import zakadabar.core.resource.theme
import zakadabar.lib.accounts.browser.login.LoginForm

class OAuthLogin : ZkPage(ZkFullScreenLayout) {

    lateinit var target: ZkAppRouting.ZkTarget

    override fun onCreate() {
        target = Dashboard
        + column {

            + AlignItems.center

            height = 100.vh
            width = 100.vw

            + gap(height = 60.px)

            + div {

                width = 300.px

                + div(zkTitleBarStyles.appTitleBar) {  //FIXME put the OAuth login form here
                    style {
                        minHeight = "unset"
                        maxHeight = "unset"
                        padding = "${theme.spacingStep / 2}px"
                    }
                    + localizedStrings.applicationName
                } marginBottom 20

                + LoginForm(onSuccess = ::onSuccess)
            }
        }
    }

    fun onSuccess() {
        window.location.href = if (::target.isInitialized) {
            application.routing.toLocalUrl(target)
        } else {
            "/"
        }
    }

}