/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages

import io.dcctech.mafita.data.MembershipAccountBo
import zakadabar.core.browser.application.target
import zakadabar.core.browser.crud.ZkCrudTarget
import zakadabar.core.browser.form.ZkForm
import zakadabar.core.browser.table.ZkTable
import zakadabar.core.resource.localized
import zakadabar.lib.accounts.data.AccountPrivateBo


class MembershipAccountCrud : ZkCrudTarget<MembershipAccountBo>() {
    init {
        companion = MembershipAccountBo.Companion
        boClass = MembershipAccountBo::class
        editorClass = MembershipAccountForm::class
        tableClass = MembershipAccountTable::class
    }
}

class MembershipAccountForm : ZkForm<MembershipAccountBo>() {
    override fun onCreate() {

        super.onCreate()

        build(localized<MembershipAccountForm>()) {
            + section {
                + bo::id
                + bo::account query { AccountPrivateBo.all().by { it.email } }
                + bo::position
                + bo::quote
                + bo::introduction
            }
        }
    }
}

class MembershipAccountTable : ZkTable<MembershipAccountBo>() {

    override fun onConfigure() {

        crud = target<MembershipAccountCrud>()

        titleText = localized<MembershipAccountTable>()

        add = true
        search = true
        export = true

        + MembershipAccountBo::id
        // ContributorBo::account // record id and opt record id is not supported yet 
        + MembershipAccountBo::position
        + MembershipAccountBo::quote
        + MembershipAccountBo::introduction

        + actions()
    }
}
