/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.data

import kotlinx.serialization.Serializable
import zakadabar.core.authorize.AccountPublicBo
import zakadabar.core.data.BaseBo
import zakadabar.core.data.EntityId

@Serializable
class ContributorBo(
    var id: EntityId<AccountPublicBo> = EntityId(0),
    var name: String,
    var image: String = "",
    var position: String,
    var introduction: String
) : BaseBo