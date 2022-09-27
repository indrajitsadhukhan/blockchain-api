package com.tutorial.core.todolist.events

import com.tutorial.core.todolist.model.TaskCompletedEventResponse
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
interface TaskCompletedEventResource : EventResource<TaskCompletedEventResponse> {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(
        tags = ["TodoList Events"],
        summary = "Get the TaskCompleted event"
    )
    override fun findBy(transactionReceiptModel: TransactionReceiptModel): List<TaskCompletedEventResponse>

    override fun onEvent(onEvent: Consumer<TaskCompletedEventResponse>): CompletableFuture<Void> =
        CompletableFuture.completedFuture(null)
}
