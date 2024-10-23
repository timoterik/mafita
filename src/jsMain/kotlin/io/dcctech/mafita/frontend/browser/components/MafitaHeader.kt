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
import kotlinx.browser.window
import org.w3c.dom.events.Event
import zakadabar.core.browser.ZkElement
import zakadabar.core.browser.application.application
import zakadabar.core.browser.button.ZkButton
import zakadabar.core.browser.layout.ZkDefaultLayout.MediaSize
import zakadabar.core.browser.theme.ZkThemeRotate
import zakadabar.core.browser.toast.toastSuccess
import zakadabar.core.resource.ZkFlavour
import zakadabar.core.resource.ZkIcons
import zakadabar.core.resource.iconSource

class MafitaHeader : ZkElement() {

    val loginIcon by iconSource("""<path d="M0 0h24v24H0z" fill="none"/><path fill="${mafitaTheme.mafitaColor}" d="M11,7L9.6,8.4l2.6,2.6H2v2h10.2l-2.6,2.6L11,17l5-5L11,7z M20,19h-8v2h8c1.1,0,2-0.9,2-2V5c0-1.1-0.9-2-2-2h-8v2h8V19z"/>""")
    var activeMediaSize = MediaSize.Uninitialized
    val closeMenu = ZkButton(ZkIcons.menu, iconSize = 100, fill = false, flavour = ZkFlavour.Primary, border = false) { toggleMenu() }
    val openMenu = ZkButton(ZkIcons.close, iconSize = 100, fill = false, flavour = ZkFlavour.Primary, border = false) { toggleMenu() }

    private val menuItems = zke {
        //        + btnWithoutBg(strings.about) { toastSuccess { "Click on ${strings.about}" } },
//        + btnWithoutBg(strings.fridayClub) { toastSuccess { "Click on ${strings.fridayClub}" } },
//        + btnWithoutBg(strings.cruSzeged) { toastSuccess { "Click on ${strings.cruSzeged}" } },
//        + btnWithoutBg(strings.documents) { toastSuccess { "Click on ${strings.documents}" } },
//        + btnWithoutBg(strings.communityService) { toastSuccess { "Click on ${strings.communityService}" } },

        + btnWithoutBg(application.serverDescription.name) { toastSuccess { "Click on ${application.serverDescription.name}" } } css appStyles.headerItem
        + btnWithoutBg(strings.camp) { toastSuccess { "Click on ${strings.camp}" } } css appStyles.headerItem
        + btnWithoutBg(strings.donation) { toastSuccess { "Click on ${strings.donation}" } } css appStyles.headerItem
        + btnWithoutBg(strings.contributors) { toastSuccess { "Click on ${strings.contributors}" } } css appStyles.headerItem
        + btnWithoutBg(strings.contact) { toastSuccess { "Click on ${strings.contact}" } } css appStyles.headerItem
        + zke {
            + ZkThemeRotate(
                ZkIcons.darkMode to AppDarkTheme(),
                ZkIcons.lightMode to AppLightTheme()
            )
        } css appStyles.headerItem
        + ZkButton(loginIcon, fill = false, iconSize = 17, flavour = ZkFlavour.Primary, border = false) { OAuthLogin().open() } css appStyles.headerItem
    }

    override fun onCreate() {

        + openMenu.hide()
        + closeMenu.hide()
        + menuItems.hide()
    }

    override fun onResume() {
        val mediaSize = if (window.outerWidth < 800) MediaSize.Small else MediaSize.Large
        if (mediaSize == activeMediaSize) {
            super.onResume()
            return
        }
        activeMediaSize = mediaSize
        when (mediaSize) {
            MediaSize.Small -> resumeSmall()
            MediaSize.Large -> resumeLarge()
            MediaSize.Uninitialized -> throw IllegalStateException()
        }

        super.onResume()
    }

    fun toggleMenu(onClick: (event: Event) -> Unit = { }){
        if (openMenu.isShown()){
            openMenu.hide()
            closeMenu.show()
        } else {
            openMenu.show()
            closeMenu.hide()
        }
        menuItems.toggle()
    }

    fun resumeSmall() {
        menuItems.build {
           + appStyles.smallHader
        }

        closeMenu.show()
        openMenu.hide()
        menuItems.hide()
    }

    fun resumeLarge() {
        menuItems.build {
            + appStyles.header
        }
        closeMenu.hide()
        openMenu.hide()
        menuItems.show()
    }

}