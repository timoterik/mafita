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
    val aboutText by """Lorem ipsum dolor sit amet, consectetur 
        <br> adipiscing elit. Suspendisse commodo consequat velit 
        <br> sed porta. Mauris sollicitudin est ante, non laoreet odio elemen.
        <br>Proin tincidunt metus vitae egestas auctor. 
        <br>Praesent efficitur turpis at elementum fermentum. Donec id viverra. 
        <br>Ut lacinia semper dui iaculis finibus. Vestibulum ante ipsum primis 
        <br>orci luctus et ultrices posuere cubilia curae; Curabitur id tempus dui. 
        <br>Nullam risus metus, tempor nec orci et, interdum viverra tortor. 
        <br>Vivamus libero augue, ultrices at ligula sit amet, elementum convallis. 
        <br>Pellentesque habitant morbi tristique senectus et netus et malesuada 
        <br>ac turpis egestas. Etiam laoreet id mi ut ornare. Donec non nunc, 
        <br>convallis tortor in, pharetra ligula. Sed iaculis faucibus dignissim. 
        <br>Class aptent taciti sociosqu ad litora torquent per conubia nostra, 
        <br>Class aptent taciti sociosqu ad litora torquent per conubia, 
        <br>Class aptent taciti sociosqu ad litora torquent per, 
        <br>per inceptos himenaeos. Ut blandit ut neque.
        <br>per inceptos himenaeos. Ut blandit ut.
        <br>
    """.trimIndent()
    val fridayClub by "Friday club"
    val cruSzeged by "Cru Szeged"
    val camp by "Camp"
    val campText by """Lorem ipsum dolor sit amet, consectetur 
        <br> adipiscing elit. Suspendisse commodo consequat velit 
        <br> sed porta. Mauris sollicitudin est ante, non laoreet odio elemen.
        <br>Proin tincidunt metus vitae egestas auctor. 
        <br>Praesent efficitur turpis at elementum fermentum. Donec id viverra. 
        <br>Ut lacinia semper dui iaculis finibus. Vestibulum ante ipsum primis 
        <br>orci luctus et ultrices posuere cubilia curae; Curabitur id tempus dui. 
        <br>Nullam risus metus, tempor nec orci et, interdum viverra tortor. 
        <br>Vivamus libero augue, ultrices at ligula sit amet, elementum convallis. 
        <br>Pellentesque habitant morbi tristique senectus et netus et malesuada 
        <br>ac turpis egestas. Etiam laoreet id mi ut ornare. Donec non nunc, 
        <br>convallis tortor in, pharetra ligula. Sed iaculis faucibus dignissim. 
        <br>Class aptent taciti sociosqu ad litora torquent per conubia nostra, 
        <br>Class aptent taciti sociosqu ad litora torquent per conubia, 
        <br>Class aptent taciti sociosqu ad litora torquent per, 
        <br>per inceptos himenaeos. Ut blandit ut neque.
        <br>per inceptos himenaeos. Ut blandit ut.
        <br>
    """.trimIndent()
    val communityService by "Community service"
    val communityServiceText by """Lorem ipsum dolor sit amet, consectetur 
        <br> adipiscing elit. Suspendisse commodo consequat velit 
        <br> sed porta. Mauris sollicitudin est ante, non laoreet odio elemen.
        <br>Proin tincidunt metus vitae egestas auctor. 
        <br>Praesent efficitur turpis at elementum fermentum. Donec id viverra. 
        <br>Ut lacinia semper dui iaculis finibus. Vestibulum ante ipsum primis 
        <br>orci luctus et ultrices posuere cubilia curae; Curabitur id tempus dui. 
        <br>Nullam risus metus, tempor nec orci et, interdum viverra tortor. 
        <br>Vivamus libero augue, ultrices at ligula sit amet, elementum convallis. 
        <br>Pellentesque habitant morbi tristique senectus et netus et malesuada 
        <br>ac turpis egestas. Etiam laoreet id mi ut ornare. Donec non nunc, 
        <br>convallis tortor in, pharetra ligula. Sed iaculis faucibus dignissim. 
        <br>Class aptent taciti sociosqu ad litora torquent per conubia nostra, 
        <br>Class aptent taciti sociosqu ad litora torquent per conubia, 
        <br>Class aptent taciti sociosqu ad litora torquent per, 
        <br>per inceptos himenaeos. Ut blandit ut neque.
        <br>per inceptos himenaeos. Ut blandit ut.
        <br>
    """.trimIndent()
    val donation by "Donation"
    val donationOnePercent by "1% financial support"
    val donationText1 by """Lorem ipsum dolor sit amet, consectetur 
        adipiscing elit. Suspendisse commodo consequat velit 
        sed porta. Mauris sollicitudin est ante, non laoreet odio elemen.
        Proin tincidunt metus vitae egestas auctor. 
        Praesent efficitur turpis at elementum fermentum. Donec id viverra. 
        Ut lacinia semper dui iaculis finibus. Vestibulum ante ipsum primis 
        orci luctus et ultrices posuere cubilia curae; Curabitur id tempus dui. 
        Nullam risus metus, tempor nec orci et, interdum viverra tortor. 
        Vivamus libero augue, ultrices at ligula sit amet, elementum convallis. 
        Pellentesque habitant morbi tristique senectus et netus et malesuada 
        ac turpis egestas. Etiam laoreet id mi ut ornare. Donec non nunc, 
        convallis tortor in, pharetra ligula. Sed iaculis faucibus dignissim. 
        Class aptent taciti sociosqu ad litora torquent per conubia nostra, 
        Class aptent taciti sociosqu ad litora torquent per conubia, 
        Class aptent taciti sociosqu ad litora torquent per, 
        per inceptos himenaeos. Ut blandit ut neque.
        per inceptos himenaeos. Ut blandit ut.
        
    """.trimIndent()
    val donationText2 by "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare massa ut dolor molestie, et fringilla velit porttitor. Duis feugiat dignissim nisl. Aenean sit amet magna lacinia, bibendum ligula vitae, maximus erat. Proin nec mi a sapien semper consequat. Nunc vitae leo at justo euismod bibendum. In non nisi eros. Nam suscipit lectus nec nibh cursus fringilla. Nam dapibus rhoncus urna ut pulvinar. Integer eget nunc sit amet dolor consequat euismod. Vivamus vestibulum neque eget."
    val contributors by "Contributors"
    val contact by "Contact"
    val fridayClubText by "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare massa ut dolor molestie, et fringilla velit porttitor. Duis feugiat dignissim nisl. Aenean sit amet magna lacinia, bibendum ligula vitae, maximus erat. Proin nec mi a sapien semper consequat. Nunc vitae leo at justo euismod bibendum. In non nisi eros. Nam suscipit lectus nec nibh cursus fringilla. Nam dapibus rhoncus urna ut pulvinar. Integer eget nunc sit amet dolor consequat euismod. Vivamus vestibulum neque eget."
    val cruSzegedText by "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare massa ut dolor molestie, et fringilla velit porttitor. Duis feugiat dignissim nisl. Aenean sit amet magna lacinia, bibendum ligula vitae, maximus erat. Proin nec mi a sapien semper consequat. Nunc vitae leo at justo euismod bibendum. In non nisi eros. Nam suscipit lectus nec nibh cursus fringilla. Nam dapibus rhoncus urna ut pulvinar. Integer eget nunc sit amet dolor consequat euismod. Vivamus vestibulum neque eget."
    val mafitaFullName by "Mai Fiatalok Támogatásáért Közhasznú Egyesület\n\n(MAFITA Egyesület)"
    val mafitaAddress by "6724 Szeged, Teréz utca 45/B"
    val organizationAddress by "Headquarters"
    val mafitaPhoneNumber by "+36308232856"
    val mafitaEmailAddress = "mafita@mafita.hu"
    val corporateTaxNumber by "Corporate tax number"
    val mafitaTaxNumber by "18477931-1-06"
    val bankAccountNumberOfMafita by "10700433-44930501-51100005"
    val bankAccountNumberOfOrganization by "Bank account number"
    val mafitaInstagramUrl by "https://www.instagram.com/mafitaegyesulet"
    val mafitaFacebookUrl by "https://www.facebook.com/mafita.egyesulet/"


}