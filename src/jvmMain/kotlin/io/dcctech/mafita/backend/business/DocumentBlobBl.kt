/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.backend.business

import io.dcctech.mafita.backend.persistence.DocumentBlobExposedPa
import io.dcctech.mafita.data.DocumentBlob
import io.dcctech.mafita.data.DocumentBo
import zakadabar.lib.blobs.business.BlobBlBase

class DocumentBlobBl : BlobBlBase<DocumentBlob, DocumentBo>(
   DocumentBlob::class,
   DocumentBlobExposedPa()
) {
   override val authorizer by provider()
}
