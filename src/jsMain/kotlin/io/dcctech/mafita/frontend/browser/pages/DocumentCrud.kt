/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package io.dcctech.mafita.frontend.browser.pages

import io.dcctech.mafita.data.DocumentBlob
import io.dcctech.mafita.data.DocumentBo
import zakadabar.core.browser.application.target
import zakadabar.core.browser.crud.ZkCrudTarget
import zakadabar.core.browser.form.ZkForm
import zakadabar.core.browser.table.ZkTable
import zakadabar.core.resource.localized
import zakadabar.lib.blobs.browser.attachment.ZkAttachmentsField


class DocumentCrud : ZkCrudTarget<DocumentBo>() {
    init {
        companion = DocumentBo.Companion
        boClass = DocumentBo::class
        editorClass = DocumentForm::class
        tableClass = DocumentTable::class
    }
}

class DocumentForm : ZkForm<DocumentBo>() {
    override fun onCreate() {
        super.onCreate()

        build(localized<DocumentForm>()) {
            + section {
                + bo::id
                + bo::type
                + bo::createAt
                + ZkAttachmentsField(
                    this@DocumentForm,
                    comm = DocumentBlob.comm,
                    reference = bo.id,
                    blobCountMax = 1,
                    disposition = bo::type.name,
                    blobClass = DocumentBlob::class
                )

            }
        }
    }
}

class DocumentTable : ZkTable<DocumentBo>() {

    override fun onConfigure() {

        crud = target<DocumentCrud>()

        titleText = localized<DocumentTable>()

        add = true
        search = true
        export = true

        + DocumentBo::id
        + DocumentBo::type
        + DocumentBo::createAt

        + actions()
    }
}
