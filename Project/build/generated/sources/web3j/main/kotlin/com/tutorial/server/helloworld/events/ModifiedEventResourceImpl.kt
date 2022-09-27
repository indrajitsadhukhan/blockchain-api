package com.tutorial.server.helloworld.events

import com.tutorial.core.helloworld.events.ModifiedEventResource
import com.tutorial.core.helloworld.model.ModifiedEventResponse
import com.tutorial.wrappers.HelloWorld
import com.tutorial.wrappers.HelloWorld.MODIFIED_EVENT
import javax.annotation.Generated
import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType
import javax.ws.rs.sse.Sse
import javax.ws.rs.sse.SseEventSink
import org.web3j.openapi.core.models.TransactionReceiptModel
import org.web3j.openapi.server.SseUtils
import org.web3j.protocol.core.methods.request.EthFilter

@Generated
class ModifiedEventResourceImpl(
    private val helloWorld: HelloWorld
) : ModifiedEventResource {

    override fun findBy(transactionReceiptModel: TransactionReceiptModel):
    List<ModifiedEventResponse> {
        val eventResponse = helloWorld.getModifiedEvents(
            transactionReceiptModel.toTransactionReceipt()
        )
        return eventResponse.map { ModifiedEventResponse(it.oldGreetingIdx, it.newGreetingIdx, it.oldGreeting, it.newGreeting) }
    }

    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS)
    fun subscribe(@Context eventSink: SseEventSink, @Context sse: Sse) {
        val flowable = helloWorld.modifiedEventFlowable(EthFilter())
        val eventClass = HelloWorld.ModifiedEventResponse::class.java
        SseUtils.subscribe(MODIFIED_EVENT, eventClass, flowable, eventSink, sse) {
            ModifiedEventResponse(it.oldGreetingIdx, it.newGreetingIdx, it.oldGreeting, it.newGreeting)
        }
    }
}
