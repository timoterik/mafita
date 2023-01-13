/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.data

import io.dcctech.mafita.enums.DocumentType
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable
import zakadabar.core.data.EntityBo
import zakadabar.core.data.EntityBoCompanion
import zakadabar.core.data.EntityId
import zakadabar.core.schema.BoSchema

@Serializable
class DocumentBo(

    override var id: EntityId<DocumentBo>,
    var name: String,
    var type: DocumentType,
    var createAt: Instant

) : EntityBo<DocumentBo> {

    companion object : EntityBoCompanion<DocumentBo>("documents")

    override fun getBoNamespace() = boNamespace
    override fun comm() = comm

    override fun schema() = BoSchema {
        + ::id
        + ::name min 3 max 60
        + ::type
        + ::createAt
    }

}
