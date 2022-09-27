package com.tutorial.core.todolist.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigInteger
import kotlin.Boolean

data class TaskCompletedEventResponse(
    @JsonProperty(value = "id")
    val id: BigInteger,
    @JsonProperty(value = "completed")
    val completed: Boolean
)
