/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.components

import io.dcctech.mafita.frontend.browser.pages.OAuthLogin
import io.dcctech.mafita.frontend.browser.resources.AppDarkTheme
import io.dcctech.mafita.frontend.browser.resources.AppLightTheme
import io.dcctech.mafita.frontend.browser.resources.appStyles
import io.dcctech.mafita.frontend.browser.resources.mafitaTheme
import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.ZkElement
import zakadabar.core.browser.button.ZkButton
import zakadabar.core.browser.theme.ZkThemeRotate
import zakadabar.core.resource.ZkFlavour
import zakadabar.core.resource.ZkIcons
import zakadabar.core.resource.iconSource

object Header {

    open val loginIcon by iconSource("""<path d="M0 0h24v24H0z" fill="none"/><path fill="${mafitaTheme.mafitaColor}" d="M11,7L9.6,8.4l2.6,2.6H2v2h10.2l-2.6,2.6L11,17l5-5L11,7z M20,19h-8v2h8c1.1,0,2-0.9,2-2V5c0-1.1-0.9-2-2-2h-8v2h8V19z"/>""")

    open val elements: List<ZkElement> = listOf(
        ZkButton(strings.applicationName, fill = false, border = false, url = "#${strings.applicationName.lowercase()}"),
        ZkButton(strings.about, fill = false, border = false, url = "#${strings.aboutUrl}"),
        ZkButton(strings.fridayClub, fill = false, border = false, url = "#${strings.fridayClubUrl}"),
        ZkButton(strings.cruSzeged, fill = false, border = false, url = "#${strings.cruSzegedUrl}"),
        ZkButton(strings.camp, fill = false, border = false, url = "#${strings.campUrl}"),
        ZkButton(strings.communityService, fill = false, border = false, url = "#${strings.contributorsUrl}"),
        ZkButton(strings.donation, fill = false, border = false, url = "#${strings.donationUrl}"),
        ZkButton(strings.contributors, fill = false, border = false, url = "#${strings.contributorsUrl}"),
        ZkButton(strings.contact, fill = false, border = false, url = "#${strings.contactUrl}"),
        ZkThemeRotate(
            ZkIcons.darkMode to AppDarkTheme(),
            ZkIcons.lightMode to AppLightTheme()
        ),
        ZkButton(loginIcon, fill = false, flavour = ZkFlavour.Custom, border = false) { OAuthLogin().open() } css appStyles.mafitaColor
    )
}
