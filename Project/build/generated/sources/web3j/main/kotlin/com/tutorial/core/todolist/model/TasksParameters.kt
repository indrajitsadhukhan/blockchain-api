package com.tutorial.core.todolist.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigInteger

data class TasksParameters(
    @JsonProperty(value = "input0")
    val input0: BigInteger
)
