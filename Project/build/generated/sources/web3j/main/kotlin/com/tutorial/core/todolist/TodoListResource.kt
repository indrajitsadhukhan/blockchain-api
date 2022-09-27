package com.tutorial.core.todolist

import com.tutorial.core.todolist.model.CreateTaskParameters
import com.tutorial.core.todolist.model.TasksParameters
import com.tutorial.core.todolist.model.ToggleCompletedParameters
import io.swagger.v3.oas.annotations.Operation
import javax.annotation.Generated
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Generated
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
interface TodoListResource {

    @get:Path("events")
    val events: TodoListEvents

    @POST
    @Path("createTask")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = ["TodoList Methods"], summary = "Execute the CreateTask method")
    fun createTask(createTaskParameters: CreateTaskParameters): org.web3j.openapi.core.models.TransactionReceiptModel

    @GET
    @Path("getAllTasks")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = ["TodoList Methods"], summary = "Execute the GetAllTasks method")
    fun getAllTasks(): org.web3j.openapi.core.models.TransactionReceiptModel

    @GET
    @Path("taskCount")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = ["TodoList Methods"], summary = "Execute the TaskCount method")
    fun taskCount(): org.web3j.openapi.core.models.ResultModel<java.math.BigInteger>

    @POST
    @Path("tasks")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = ["TodoList Methods"], summary = "Execute the Tasks method")
    fun tasks(tasksParameters: TasksParameters): org.web3j.openapi.core.models.ResultModel<org.web3j.tuples.generated.Tuple3<java.math.BigInteger, kotlin.String, kotlin.Boolean>>

    @POST
    @Path("toggleCompleted")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = ["TodoList Methods"], summary = "Execute the ToggleCompleted method")
    fun toggleCompleted(toggleCompletedParameters: ToggleCompletedParameters): org.web3j.openapi.core.models.TransactionReceiptModel
}
