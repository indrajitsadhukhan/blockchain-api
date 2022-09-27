package com.tutorial.core.helloworld.model

import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.String

data class HelloWorldDeployParameters(
    @JsonProperty(value = "_greet")
    val _greet: String
)
