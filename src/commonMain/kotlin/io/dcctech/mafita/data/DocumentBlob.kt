/*
 * Copyright © 2022-2023, DCCTech, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.data

import kotlinx.serialization.Serializable
import zakadabar.core.data.EntityId
import zakadabar.lib.blobs.data.BlobBo
import zakadabar.lib.blobs.data.BlobBoCompanion


@Serializable
class DocumentBlob(
    override var id: EntityId<DocumentBlob>,
    override var disposition: String,
    override var reference: EntityId<DocumentBo>?,
    override var name: String,
    override var mimeType: String,
    override var size: Long
) : BlobBo<DocumentBlob, DocumentBo> {

    companion object : BlobBoCompanion<DocumentBlob, DocumentBo>("document-blob")

    override fun getBoNamespace() = boNamespace
    override fun comm() = comm

}
