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
    val slogan by "Experiences of a lifetime"
    val about by "About"
    val aboutText by """Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse commodo consequat velit sed porta. Mauris sollicitudin est ante, non laoreet odio elementum ut. Proin tincidunt metus vitae egestas auctor. Praesent efficitur turpis at elementum fermentum. Donec id viverra purus. Ut lacinia semper dui iaculis finibus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Curabitur id tempus dui. Nullam risus metus, tempor nec orci et, interdum viverra tortor. Vivamus libero augue, ultrices at ligula sit amet, elementum convallis ligula. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.\n" +
            "Aliquam odio odio, aliquet eu orci non, faucibus malesuada enim. Nullam at quam erat. Maecenas tincidunt efficitur ultricies. Cras erat est, viverra vel ex a, mollis posuere nulla. Etiam laoreet id mi ut ornare. Donec non nunc eleifend, convallis tortor in, pharetra ligula. Sed iaculis faucibus dignissim. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Ut blandit ut neque et tincidunt."""
    val fridayClub by "Friday club"
    val cruSzeged by "Cru Szeged"
    val camp by "Camp"
    val communityService by "Community service"
    val donation by "Donation"
    val contributors by "Contributors"
    val contact by "Contact"


}