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
    val aboutUrl by "about"
    val aboutText by """
        After four years of voluntary activity, the decision was made <br>
        in 2007 to establish the Mai Fiatalok Támogatásáért<br>
        Közhasznú Egyesület (MAFITA), so the founding members <br>
        could continue the activities they had started earlier<br>
        within an organized framework.<br>
        <br>
        Dealing with young people began already in the spring of 2003 with youth<br>
        clubs and interactive class teacher classes, in which special emphasis was<br>
        placed on the development of the character and relationships of young<br>
        people (age group 13-18). This was also linked to AIDS and drug prevention.<br>
        <br>
        These were realized through the application of the <a href="https://www.cru.org" target="_blank" style="color:#DF6107;">Cru</a> (Campus Crusade for Christ International)<br> 
        program with the work of volunteer adults, who were able to develop their activities <br>
        in more and more schools over the years (Cru Szeged).<br> 
        <br>
        In addition to holding classroom lessons and organizing clubs,<br> 
        the volunteers also organized summer camps.
        <br>
    """.trimIndent()
    val fridayClub by "Friday club"
    val fridayClubUrl by "friday-club"
    val cruSzeged by "Cru Szeged"
    val cruSzegedUrl by "cru-szeged"
    val camp by "Camp"
    val campUrl by "camp"
    val campText by """
        The approach of summer always causes exciting activity in the life<br>
        of our association, as we start organizing our summer camp with<br>
        the involvement of our volunteer team. Our goal and desire are that<br>
        during these 6 days, all young people will be enriched with contacts,<br>
        experiences and experiences that will help their lives in the long term.<br>
        <br>
       For this, we prepare games and various programs in which all age<br>
       groups can actively participate, e.g.: beach, quizzes, adventure tours,<br>
       and night tours. In addition to these, adapted to the interests of the<br>
       age groups, we add color to the mega days with interactive exhibitions<br>
       and interesting performances, and each year we work on defining topics<br>
       that are present in the lives of today's young people and have an impact<br>
       on them, e.g.: addictions, correct self-image, conflict management,<br>
       parent-child relationship and current issues caused by our world.<br>
       <br>
       Our desire is to hear the voices of young people, we want to understand,<br>
       help and prepare them to enter the future with a more secure set of values.<br>
       Every year, our colorful, lively, youthfully dynamic team guarantees a<br>
       good mood, excitement and everything necessary to make this one week<br>
       unforgettable for everyone.<br>
       We welcome the application of all enthusiastic young people between<br>
       the ages of 8 and 18 by filling out the form below!
    """.trimIndent()
    val communityService by "Community service"
    val communityServiceUrl by "community-service"
    val communityServiceText by """
        Starting in 2016, the prerequisite for applying for the<br>
        baccalaureate exam is that all students perform 50 hours<br>
        of community service during their secondary school studies,<br>
        in accordance with the 2011 CXC Act on National Public Education.<br>
        Students perform community service without compensation in order<br>
        to serve the interests of the local community and, in the meantime,<br>
        develop their own personalities, abilities, and skills.<br>
        <br>
        For community service, it is worth choosing an activity that the young<br>
        person is interested in, can use their talents, and would even like to<br>
        continue in the future. Of course, this is not easy for most young people.<br>
        Our association tries to help young people try their hand at as many<br>
        types of tasks as possible.<br>
        <br>
        The Association organizes community work in the following areas of activity:<br>
        <ul style="text-align:right;direction: rtl;">
            <li>animal shelter - landscaping</li>
            <li>home for the elderly – assistance (walking, reading, helping with meals)</li>
            <li>food preparation for a homeless shelter</li>
            <li>food distribution - at a homeless shelter</li>
            <li>program organization for primary school students (club events, competitions)</li>
            <li>helping the elderly and small children with chores around the house</li>
            <li>cleaning of natural areas</li>
        </ul>
        Our association not only accompanies young people to the site, but<br>
        provides supervision, and organizes related programs. The volunteers<br>
        of the Association talk to the young people about the purpose of the<br>
        task to be carried out, why the assistance they provide is important,<br>
        and why their activity is useful. They evaluate the work done afterward,<br>
        try to answer the questions that have arisen; and offer a relaxing<br>
        program - in the form of a shared snack, games or watching a movie.<br>
        <br>
        For more information, contact me at mafita@mafita.hu or by phone.
    """.trimIndent()
    val donation by "Donation"
    val donationUrl by "donation"
    val donationOnePercent by "1% financial support"
    val donationText1 by """
        Dear Supporter!<br>
        This year too, we can offer 1% of our personal income tax<br>
        to the MAFITA Association!<br>
        MAFITA Egyesület, having fulfilled the legal conditions,<br>
        is included in the 2022 list of Registered Civil Beneficiaries<br>
        published on the NAV website, so it can claim the 1% subsidy<br>
        that can be offered to civil organizations. The easiest way<br>
        to fill out the declaration of ownership is by<br>
        initiating it from the above website.<br>
        <br>
        Tax number of the Association: 18477931-1-06<br>
        The exact name of the Association: Public Benefit Association<br>
        for the Support of Today's Youth.<br>
        It is possible to submit the provision on 1% of the personal<br>
        income tax until May 20, 2023, this deadline is void, and failure<br>
        to do so cannot be excused by a request for certification.<br>
        <br>
        The statement of authority can be submitted:
         <ul>
            <li>together with the personal income tax return (electronically through the customer portal, by post, or in person at NAV's customer services)</li>
            <li>on the new online interface after March 15, 2022, using the WebNYK program</li>
            <li>in case of employer tax assessment, submitted in a sealed 
            envelope by May 10, 2023 to the employer, (It is important that 
            the sealed envelope has the tax identification number on it 
            and his signature on the place where it is glued!)</li>
            <li>on form 16EGYSZA (via the customer portal electronically or by post, or
                    at NAV's customer services in person, in this case in a sealed 
                    envelope with a tax identification mark)</li>
            <li>as a declaration sheet matching the data content of form
             16EGYSZA, in a self-sealed postal envelope with a tax identification
              number (by post or in person at NAV customer services)</li>
            <li>separately from the return, directly to NAV</li>
        </ul>
        (source: nav.gov.hu)
    """.trimIndent()
    val donationText2 by """
        The Association can of course be supported in other ways.<br>
        They can transfer their donations to the account number of the<br>
        Association - CIB Bank 10700433-44930501-51100005;<br>
        if you would like to deliver your donation in another way,<br>
        or if you would like to offer help in kind or volunteer work,<br>
        please contact us at mafita@mafita.hu.<br>
        Thank you in advance for your help!
    """.trimIndent()
    val contributors by "Contributors"
    val contributorsUrl by "contributors"
    val contact by "Contact"
    val contactUrl by "contact"
    val fridayClubText by """
        During the school's Cru classes, the need for both the organizers<br>
        and the young people to have an accepting, safe space where they<br>
        young people can meet, talk, and form friendships, even after<br>
        the end of the program series, became increasingly clear.<br>
        That's why we started our regular club events, where we welcome<br>
        young people with topic evaluation discussions, game nights or<br>
        even sports programs.
        <br><br>
        The topics of the conversations are varied, and they try to cover<br>
        the expressed and unsaid questions and problems of young people.<br>
        We talk about dreams and desires, the vision of the future,<br>
        human relationships, difficulties, loyalty, and fears,<br>
        but also about hobbies, movies, fitting in, and friends - <br>
        the goal is to involve young people and encourage them to think<br>
        so that they can become independent, mature individuals<br>
        capable of making appropriate decisions.<br>
        Club Fridays, as the name implies, are held every Friday<br>
        between 7 p.m. and 9 p.m. The target age group is 12-18-year-olds.
        <br><br>
        The programs of the club events are varied: Topic evaluation discussion:<br>
        we choose a topic (for example: You're driving me crazy!,<br>
        Courage or recklessness, Decisions, Fear, Promises, resolutions,<br>
        Conflicts, What is feminism? Love languages) and we use all the tools<br>
        to talk about it in an interesting way. Here, young people can<br>
        freely express their opinions, and debate, but also participate<br>
        as silent observers. We try to choose the topics together with<br>
        the young people, according to their needs and interests and adapt<br>
        them accordingly. If we feel like it, we play, i.e. we do a<br>
        frenetic Activity show or we go shopping; maybe we play a sport:<br>
        soccer, bowling, bowling, ice skating, or whatever comes up.<br>
        On occasions, interactivity plays a key role; so that everyone can speak<br>
        and express themselves more courageously, we also hold small<br>
        group discussions within the larger group.<br>
        All services of the club organized by the MAFITA Association are free<br>
        for young people.<br>
        We welcome all interested parties!
        <br><br>
        You can find out about the program and the time of the next event<br>
        on our Facebook page. The occasions at present we hold it at:<br>
    """.trimIndent()
    val cruSzegedText by """
        Cru (Campus Crusade for Christ International) is a relationship and<br>
        character builder; AIDS and drug prevention program,<br>
        which was launched by the Timóteus Society in 1994, at the request<br>
        of the National Health Protection Institute. The MAFITA Association<br>
        holds classes in schools using this program and organizes<br>
        afternoon clubs.<br>
        <br>
        The structure of the program is a series of 7-8 sessions,<br>
        which we put together according to demand and tailored to the group,<br>
        but even just one topic at a time.<br>
        Some topics based on FÉK:<br>
        - "Am I who others say I am?" - (self-assessment)<br>
        – "Lifelong friendships" - (friendship)<br>
        - "Why do we react differently?" - (personality types)<br>
        - "When the pump went up..." - (conflict management)<br>
        - "Sex or what?" - (AIDS prevention)<br>
        - "The drug, is it good?" - (drug prevention)<br>
        - "How, where to next?" - (decisions)<br>
        – "What is the ideal family like?" - (family models)<br>
        <br>
        On a voluntary basis, we hold the headmaster's classes and<br>
        organize the afternoon club event. Our service is free!<br>
        <br>
        A detailed description of the program can be found on<br>
        the website <a href="https://www.cru.org" target="_blank" style="color:#DF6107;">Cru</a> (Campus Crusade for Christ International).<br>
        If you need lessons, please contact:<br>Csaba Koha, the Szeged Cru coordinator!
    """.trimIndent()
    val mafitaFullName by """Mai Fiatalok Támogatásáért Közhasznú Egyesület<br>(MAFITA Egyesület)""".trimIndent()
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