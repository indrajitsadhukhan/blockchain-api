package com.tutorial.server.todolist.events

import com.tutorial.core.todolist.events.TaskCompletedEventResource
import com.tutorial.core.todolist.model.TaskCompletedEventResponse
import com.tutorial.wrappers.TodoList
import com.tutorial.wrappers.TodoList.TASKCOMPLETED_EVENT
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
class TaskCompletedEventResourceImpl(
    private val todoList: TodoList
) : TaskCompletedEventResource {

    override fun findBy(transactionReceiptModel: TransactionReceiptModel):
    List<TaskCompletedEventResponse> {
        val eventResponse = todoList.getTaskCompletedEvents(
            transactionReceiptModel.toTransactionReceipt()
        )
        return eventResponse.map { TaskCompletedEventResponse(it.id, it.completed) }
    }

    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS)
    fun subscribe(@Context eventSink: SseEventSink, @Context sse: Sse) {
        val flowable = todoList.taskCompletedEventFlowable(EthFilter())
        val eventClass = TodoList.TaskCompletedEventResponse::class.java
        SseUtils.subscribe(TASKCOMPLETED_EVENT, eventClass, flowable, eventSink, sse) {
            TaskCompletedEventResponse(it.id, it.completed)
        }
    }
}
