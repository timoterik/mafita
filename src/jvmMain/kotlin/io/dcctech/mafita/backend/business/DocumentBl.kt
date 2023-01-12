/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.backend.business


import io.dcctech.mafita.backend.persistence.DocumentPa
import io.dcctech.mafita.data.DocumentBo
import zakadabar.core.business.EntityBusinessLogicBase

open class DocumentBl : EntityBusinessLogicBase<DocumentBo>(
    boClass = DocumentBo::class
) {

    override val pa = DocumentPa()

    override val authorizer by provider()

}
