/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.components

import io.dcctech.mafita.frontend.browser.resources.AppDarkTheme
import io.dcctech.mafita.frontend.browser.resources.AppLightTheme
import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.ZkElement
import zakadabar.core.browser.theme.ZkThemeRotate
import zakadabar.core.browser.toast.toastSuccess
import zakadabar.core.resource.ZkColors
import zakadabar.core.resource.ZkIcons
import zakadabar.core.resource.css.vh
import zakadabar.lib.accounts.browser.login.Login

class MafitaHeader : ZkElement() {

    private val navBtnArray = listOf(
        zke { + btnWithoutBg(strings.about) { toastSuccess { "Click on ${strings.about}" } } },
        zke { + btnWithoutBg(strings.fridayClub) { toastSuccess { "Click on ${strings.fridayClub}" } } },
        zke { + btnWithoutBg(strings.cruSzeged) { toastSuccess { "Click on ${strings.cruSzeged}" } } },
        zke { + btnWithoutBg(strings.camp) { toastSuccess { "Click on ${strings.camp}" } } },
        zke { + btnWithoutBg(strings.communityService) { toastSuccess { "Click on ${strings.communityService}" } } },
        zke { + btnWithoutBg(strings.donation) { toastSuccess { "Click on ${strings.donation}" } } },
        zke { + btnWithoutBg(strings.contributors) { toastSuccess { "Click on ${strings.contributors}" } } },
        zke { + btnWithoutBg(strings.documents) { toastSuccess { "Click on ${strings.documents}" } } },
        zke { + btnWithoutBg(strings.contact) { toastSuccess { "Click on ${strings.contact}" } } },
        zke { + btnWithoutBg(strings.contact) { toastSuccess { "Click on ${strings.contact}" } } },
        zke { + btnWithoutBg(strings.login) { Login().open() } }
    )

    override fun onCreate() {
        super.onCreate()

        + row {

            style {
                height = 10.vh
                background = ZkColors.Yellow.a400
            }


            navBtnArray.forEach {
                + column {
                    + appStyles.navCol
                    + it
                }
            }

            + column {
                + appStyles.navCol

                + ZkThemeRotate(
                    ZkIcons.darkMode to AppDarkTheme(),
                    ZkIcons.lightMode to AppLightTheme()
                )
            }
        }
    }

}