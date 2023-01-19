/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.components

import io.dcctech.mafita.frontend.browser.pages.OAuthLogin
import io.dcctech.mafita.frontend.browser.resources.AppDarkTheme
import io.dcctech.mafita.frontend.browser.resources.AppLightTheme
import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.ZkElement
import zakadabar.core.browser.application.application
import zakadabar.core.browser.button.ZkButton
import zakadabar.core.browser.theme.ZkThemeRotate
import zakadabar.core.browser.toast.toastSuccess
import zakadabar.core.resource.ZkIcons
import zakadabar.core.resource.iconSource

class MafitaHeader : ZkElement() {

    val loginIcon by iconSource("""<path d="M0 0h24v24H0z" fill="none"/><path d="M11,7L9.6,8.4l2.6,2.6H2v2h10.2l-2.6,2.6L11,17l5-5L11,7z M20,19h-8v2h8c1.1,0,2-0.9,2-2V5c0-1.1-0.9-2-2-2h-8v2h8V19z"/>""")

    private val navBtnArray = listOf(
        + btnWithoutBg(application.serverDescription.name) { toastSuccess { "Click on ${application.serverDescription.name}" } },
        + btnWithoutBg(strings.about) { toastSuccess { "Click on ${strings.about}" } },
        + btnWithoutBg(strings.fridayClub) { toastSuccess { "Click on ${strings.fridayClub}" } },
        + btnWithoutBg(strings.cruSzeged) { toastSuccess { "Click on ${strings.cruSzeged}" } },
        + btnWithoutBg(strings.camp) { toastSuccess { "Click on ${strings.camp}" } },
        + btnWithoutBg(strings.communityService) { toastSuccess { "Click on ${strings.communityService}" } },
        + btnWithoutBg(strings.donation) { toastSuccess { "Click on ${strings.donation}" } },
        + btnWithoutBg(strings.contributors) { toastSuccess { "Click on ${strings.contributors}" } },
        + btnWithoutBg(strings.documents) { toastSuccess { "Click on ${strings.documents}" } },
        + btnWithoutBg(strings.contact) { toastSuccess { "Click on ${strings.contact}" } }
    )
    override fun onCreate() {
        super.onCreate()

        + zke {
            + appStyles.nav
            navBtnArray.forEach {
                + zke {
                    + it
                }
            }
            + zke {
                + ZkThemeRotate(
                    ZkIcons.darkMode to AppDarkTheme(),
                    ZkIcons.lightMode to AppLightTheme()
                )
            }
            + zke {
                + ZkButton(loginIcon, fill = false, border = false) { OAuthLogin().open() }
            }
        }
    }
}