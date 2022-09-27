package com.tutorial.core.todolist.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigInteger
import kotlin.Boolean
import kotlin.String

data class TaskCreatedEventResponse(
    @JsonProperty(value = "id")
    val id: BigInteger,
    @JsonProperty(value = "content")
    val content: String,
    @JsonProperty(value = "completed")
    val completed: Boolean
)
