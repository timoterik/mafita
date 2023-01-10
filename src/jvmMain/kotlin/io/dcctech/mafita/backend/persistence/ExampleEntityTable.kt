/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.backend.persistence

import zakadabar.core.persistence.exposed.ExposedPaTable
import io.dcctech.mafita.data.ExampleEntityBo

object ExampleEntityTable : ExposedPaTable<ExampleEntityBo>(
    tableName = "example_entity"
) {

    internal val name = varchar("name", 100)

}