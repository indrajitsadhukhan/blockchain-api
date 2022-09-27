package com.tutorial.core.todolist.model

import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.String

data class CreateTaskParameters(
    @JsonProperty(value = "_content")
    val _content: String
)
