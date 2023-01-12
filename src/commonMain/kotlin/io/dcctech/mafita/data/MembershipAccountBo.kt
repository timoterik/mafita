/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.data

import kotlinx.serialization.Serializable
import zakadabar.core.data.EntityBo
import zakadabar.core.data.EntityBoCompanion
import zakadabar.core.data.EntityId
import zakadabar.core.schema.BoSchema
import zakadabar.lib.accounts.data.AccountPrivateBo


@Serializable
class MembershipAccountBo(

    override var id: EntityId<MembershipAccountBo>,
    var account: EntityId<AccountPrivateBo>,
    var position: String?,
    var quote: String?,
    var introduction: String

) : EntityBo<MembershipAccountBo> {

    companion object : EntityBoCompanion<MembershipAccountBo>("membership-accounts")

    override fun getBoNamespace() = boNamespace
    override fun comm() = comm

    override fun schema() = BoSchema {
        + ::id
        + ::account
        + ::position blank true min 2 max 25
        + ::quote min 2 max 25
        + ::introduction blank false min 2 max 100
    }

}
