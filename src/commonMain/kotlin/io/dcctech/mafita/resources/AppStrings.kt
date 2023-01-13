/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
@file:Suppress("unused") // auto binding makes this inspection useless

package io.dcctech.mafita.resources

import zakadabar.core.resource.ZkBuiltinStrings

// This pattern makes it possible to switch the strings easily. Demo can work as
// a standalone application, but it is possible to use it as a component library.
// In that case - or when you write an actual component library - you want to your
// strings to be customizable.

internal var strings = AppStrings()

class AppStrings : ZkBuiltinStrings() {
    override val applicationName by "Mafita"
    val exampleEntityCrud by "Example Entities"

    // these will most likely change a bit with the first release of July 2021

    override val accountName by "Account Name"
    override val email by "E-mail"
    override val phone by "Phone"
    override val locked by "Locked"
    override val lastLoginSuccess by "Last Login Success"
    override val lastLoginFail by "Last Login Fail"
    val description by "Description"
    override val loginFailCount by "Login Fail Count"
    val DocumentBo by "DocumentBo"
    val documents by "Documents"
    val document by "Document"
    val slogen by "Experiences of a lifetime"
    val about by "About"
    val fridayClub by "Friday club"
    val cruSzeged by "Cru Szeged"
    val camp by "Camp"
    val communityService by "Community service"
    val donation by "Donation"
    val contributors by "Contributors"
    val contact by "Contact"


}