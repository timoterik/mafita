/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.backend.persistence

import io.dcctech.mafita.data.MembershipAccountBo
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.statements.UpdateBuilder
import zakadabar.core.persistence.exposed.ExposedPaBase
import zakadabar.core.persistence.exposed.ExposedPaTable
import zakadabar.core.persistence.exposed.entityId
import zakadabar.lib.accounts.persistence.AccountPrivateExposedTableCommon


open class MembershipAccountAccountPa(
    table: MembershipAccountTable = MembershipAccountTableDefault
) : ExposedPaBase<MembershipAccountBo, MembershipAccountTable>(
    table = table
) {
    override fun ResultRow.toBo() = MembershipAccountBo(
        id = this[table.id].entityId(),
        account = this[table.account].entityId(),
        position = this[table.position],
        quote = this[table.quote],
        introduction = this[table.introduction]
    )

    override fun UpdateBuilder<*>.fromBo(bo: MembershipAccountBo) {
        this[table.account] = bo.account.toLong()
        this[table.position] = bo.position
        this[table.quote] = bo.quote
        this[table.introduction] = bo.introduction
    }
}

object MembershipAccountTableDefault : MembershipAccountTable()

open class MembershipAccountTable(
    tableName: String = "membership_accounts"
) : ExposedPaTable<MembershipAccountBo>(
    tableName = tableName
) {

    val account = reference("account", AccountPrivateExposedTableCommon)
    val position = varchar("position", 25).nullable()
    val quote = varchar("quote", 25).nullable()
    val introduction = varchar("introduction", 100)

}
