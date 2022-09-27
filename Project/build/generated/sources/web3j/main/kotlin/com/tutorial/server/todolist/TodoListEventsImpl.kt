package com.tutorial.server.todolist

import com.tutorial.core.todolist.TodoListEvents
import com.tutorial.server.todolist.events.TaskCompletedEventResourceImpl
import com.tutorial.server.todolist.events.TaskCreatedEventResourceImpl
import com.tutorial.wrappers.TodoList
import javax.annotation.Generated
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.openapi.server.SubResourceImpl

@Generated
class TodoListEventsImpl(
    todoList: TodoList,
    uriInfo: ExtendedUriInfo
) : TodoListEvents, SubResourceImpl(uriInfo) {

    override val taskCompleted = TaskCompletedEventResourceImpl(todoList)
    override val taskCreated = TaskCreatedEventResourceImpl(todoList)
}
