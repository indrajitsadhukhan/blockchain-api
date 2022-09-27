package com.tutorial.core.todolist

import com.tutorial.core.todolist.events.TaskCompletedEventResource
import com.tutorial.core.todolist.events.TaskCreatedEventResource
import io.swagger.v3.oas.annotations.Operation
import javax.annotation.Generated
import javax.ws.rs.Path
import org.web3j.openapi.core.SubResource

@Generated
interface TodoListEvents : SubResource {

    @Operation(tags = ["TodoList Events"], summary = "List all TodoList events")
    override fun findAll(): List<String>

    @get:Path("taskCompleted")
    val taskCompleted: TaskCompletedEventResource

    @get:Path("taskCreated")
    val taskCreated: TaskCreatedEventResource
}
