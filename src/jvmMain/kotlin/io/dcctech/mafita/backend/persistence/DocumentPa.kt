/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.backend.persistence

import io.dcctech.mafita.data.DocumentBo
import io.dcctech.mafita.enums.DocumentType
import kotlinx.datetime.toJavaInstant
import kotlinx.datetime.toKotlinInstant
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.`java-time`.timestamp
import org.jetbrains.exposed.sql.statements.UpdateBuilder
import zakadabar.core.persistence.exposed.ExposedPaBase
import zakadabar.core.persistence.exposed.ExposedPaTable
import zakadabar.core.persistence.exposed.entityId

open class DocumentPa(
    table: DocumentTable = DocumentTableDefault
) : ExposedPaBase<DocumentBo, DocumentTable>(
    table = table
) {
    override fun ResultRow.toBo() = DocumentBo(
        id = this[table.id].entityId(),
        name = this[table.name],
        type = this[table.type],
        createAt = this[table.createAt].toKotlinInstant()
    )

    override fun UpdateBuilder<*>.fromBo(bo: DocumentBo) {
        this[table.name] = bo.name
        this[table.type] = bo.type
        this[table.createAt] = bo.createAt.toJavaInstant()
    }
}

object DocumentTableDefault : DocumentTable()

open class DocumentTable(
    tableName: String = "document"
) : ExposedPaTable<DocumentBo>(
    tableName = tableName
) {

    val name = varchar("name", length = 60)
    val type = enumerationByName("type", 15, DocumentType::class)
    val createAt = timestamp("create_at")

}
