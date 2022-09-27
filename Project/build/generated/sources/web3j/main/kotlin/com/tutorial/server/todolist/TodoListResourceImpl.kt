package com.tutorial.server.todolist

import com.tutorial.core.todolist.TodoListEvents
import com.tutorial.core.todolist.TodoListResource
import com.tutorial.core.todolist.model.CreateTaskParameters
import com.tutorial.core.todolist.model.TasksParameters
import com.tutorial.core.todolist.model.ToggleCompletedParameters
import com.tutorial.wrappers.TodoList
import java.math.BigInteger
import kotlin.Boolean
import kotlin.String
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.openapi.core.models.ResultModel
import org.web3j.openapi.core.models.TransactionReceiptModel
import org.web3j.tuples.generated.Tuple3

class TodoListResourceImpl(
    private val todoList: TodoList,
    private val uriInfo: ExtendedUriInfo
) : TodoListResource {
    override val events: TodoListEvents = TodoListEventsImpl(todoList, uriInfo)

    override fun createTask(createTaskParameters: CreateTaskParameters): TransactionReceiptModel =
        TransactionReceiptModel(
            todoList.createTask(
                createTaskParameters._content
            ).send()
        )
    override fun getAllTasks(): TransactionReceiptModel =
        TransactionReceiptModel(todoList.getAllTasks().send())
    override fun taskCount(): ResultModel<BigInteger> =
        org.web3j.openapi.core.models.ResultModel(todoList.taskCount().send())
    override fun tasks(tasksParameters: TasksParameters): ResultModel<Tuple3<BigInteger, String,
            Boolean>> {
        val (bigInteger0, string1, boolean2) = todoList.tasks(
            tasksParameters.input0
        ).send()
        return org.web3j.openapi.core.models.ResultModel(
            Tuple3(bigInteger0, string1, boolean2)
        )
    }

    override fun toggleCompleted(toggleCompletedParameters: ToggleCompletedParameters):
    TransactionReceiptModel = TransactionReceiptModel(
        todoList.toggleCompleted(
            toggleCompletedParameters._id
        ).send()
    )
}
