/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.components

import io.dcctech.mafita.resources.strings
import zakadabar.core.browser.sidebar.ZkSideBar
import zakadabar.core.browser.toast.toastSuccess
import zakadabar.lib.accounts.browser.login.Login

class MafitaSideBar : ZkSideBar() {

    override fun onCreate() {
        super.onCreate()
//            + item(application.title.text) { toastSuccess { "Click on ${application.title.text}" } }
        + item(strings.about) { toastSuccess { "Click on ${strings.about}" } }
        + item(strings.fridayClub) { toastSuccess { "Click on ${strings.fridayClub}" } }
        + item(strings.cruSzeged) { toastSuccess { "Click on ${strings.cruSzeged}" } }
        + item(strings.camp) { toastSuccess { "Click on ${strings.camp}" } }
        + item(strings.communityService) { toastSuccess { "Click on ${strings.communityService}" } }
        + item(strings.donation) { toastSuccess { "Click on ${strings.donation}" } }
        + item(strings.contributors) { toastSuccess { "Click on ${strings.contributors}" } }
        + item(strings.documents) { toastSuccess { "Click on ${strings.documents}" } }
        + item(strings.contact) { toastSuccess { "Click on ${strings.contact}" } }
        + item<Login>()
    }
}
