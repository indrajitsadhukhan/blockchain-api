package com.tutorial.core.helloworld.events

import com.tutorial.core.helloworld.model.ModifiedEventResponse
import io.swagger.v3.oas.annotations.Operation
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import javax.annotation.Generated
import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import org.web3j.openapi.core.EventResource
import org.web3j.openapi.core.models.TransactionReceiptModel

@Generated
interface ModifiedEventResource : EventResource<ModifiedEventResponse> {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(
        tags = ["HelloWorld Events"],
        summary = "Get the Modified event"
    )
    override fun findBy(transactionReceiptModel: TransactionReceiptModel): List<ModifiedEventResponse>

    override fun onEvent(onEvent: Consumer<ModifiedEventResponse>): CompletableFuture<Void> =
        CompletableFuture.completedFuture(null)
}
