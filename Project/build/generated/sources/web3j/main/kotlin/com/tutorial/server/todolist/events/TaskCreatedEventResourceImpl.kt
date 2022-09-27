package com.tutorial.server.todolist.events

import com.tutorial.core.todolist.events.TaskCreatedEventResource
import com.tutorial.core.todolist.model.TaskCreatedEventResponse
import com.tutorial.wrappers.TodoList
import com.tutorial.wrappers.TodoList.TASKCREATED_EVENT
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
class TaskCreatedEventResourceImpl(
    private val todoList: TodoList
) : TaskCreatedEventResource {

    override fun findBy(transactionReceiptModel: TransactionReceiptModel):
    List<TaskCreatedEventResponse> {
        val eventResponse = todoList.getTaskCreatedEvents(
            transactionReceiptModel.toTransactionReceipt()
        )
        return eventResponse.map { TaskCreatedEventResponse(it.id, it.content, it.completed) }
    }

    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS)
    fun subscribe(@Context eventSink: SseEventSink, @Context sse: Sse) {
        val flowable = todoList.taskCreatedEventFlowable(EthFilter())
        val eventClass = TodoList.TaskCreatedEventResponse::class.java
        SseUtils.subscribe(TASKCREATED_EVENT, eventClass, flowable, eventSink, sse) {
            TaskCreatedEventResponse(it.id, it.content, it.completed)
        }
    }
}
