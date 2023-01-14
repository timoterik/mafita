/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
@file:Suppress("unused") // main is called by webpack

import io.dcctech.mafita.frontend.browser.Routing
import io.dcctech.mafita.frontend.browser.resources.AppDarkTheme
import io.dcctech.mafita.frontend.browser.resources.AppLightTheme
import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.application.ZkApplication
import zakadabar.core.browser.application.application
import zakadabar.core.browser.util.io
import zakadabar.core.resource.initTheme

fun main() {

    application = ZkApplication()

    zakadabar.lib.accounts.browser.install(application)
    zakadabar.lib.i18n.browser.install(application)
    zakadabar.softui.browser.install()

    io {

        with(application) {

            initSession()

            initTheme(AppLightTheme(), AppDarkTheme())

            initLocale(strings)

            initRouting(Routing())

            run()

        }

    }

}