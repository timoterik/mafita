/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.backend.business


import io.dcctech.mafita.backend.persistence.MembershipAccountAccountPa
import io.dcctech.mafita.data.MembershipAccountBo
import zakadabar.core.business.EntityBusinessLogicBase

open class MembershipAccountBl : EntityBusinessLogicBase<MembershipAccountBo>(
    boClass = MembershipAccountBo::class
) {

    override val pa = MembershipAccountAccountPa()

    override val authorizer by provider()

}
