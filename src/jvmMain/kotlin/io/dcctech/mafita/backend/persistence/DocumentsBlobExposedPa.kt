/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.backend.persistence

import io.dcctech.mafita.data.DocumentBlob
import io.dcctech.mafita.data.DocumentBo
import zakadabar.core.util.default
import zakadabar.lib.blobs.persistence.BlobExposedPa
import zakadabar.lib.blobs.persistence.BlobExposedTable


class DocumentBlobExposedPa : BlobExposedPa<DocumentBlob, DocumentBo>(
   table = DocumentBlobExposedTable,
) {
   override fun newInstance() = default<DocumentBlob> { }
}


object DocumentBlobExposedTable : BlobExposedTable<DocumentBlob, DocumentBo>(
   tableName = "document_blob",
   referenceTable = DocumentTableDefault
)
