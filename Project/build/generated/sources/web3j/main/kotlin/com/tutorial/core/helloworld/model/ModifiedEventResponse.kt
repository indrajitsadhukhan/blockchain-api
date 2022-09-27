package com.tutorial.core.helloworld.model

import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.ByteArray
import kotlin.String

data class ModifiedEventResponse(
    @JsonProperty(value = "oldGreetingIdx")
    val oldGreetingIdx: ByteArray,
    @JsonProperty(value = "newGreetingIdx")
    val newGreetingIdx: ByteArray,
    @JsonProperty(value = "oldGreeting")
    val oldGreeting: String,
    @JsonProperty(value = "newGreeting")
    val newGreeting: String
)
