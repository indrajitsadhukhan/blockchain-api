package com.tutorial.server.mortal

import com.tutorial.core.mortal.MortalEvents
import com.tutorial.core.mortal.MortalResource
import com.tutorial.wrappers.Mortal
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.openapi.core.models.TransactionReceiptModel

class MortalResourceImpl(
    private val mortal: Mortal,
    private val uriInfo: ExtendedUriInfo
) : MortalResource {
    override val events: MortalEvents = MortalEventsImpl(mortal, uriInfo)

    override fun kill(): TransactionReceiptModel = TransactionReceiptModel(mortal.kill().send())
}
