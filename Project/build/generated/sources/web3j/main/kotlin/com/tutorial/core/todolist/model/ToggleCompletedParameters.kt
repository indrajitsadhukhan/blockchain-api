package com.tutorial.core.todolist.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigInteger

data class ToggleCompletedParameters(
    @JsonProperty(value = "_id")
    val _id: BigInteger
)
