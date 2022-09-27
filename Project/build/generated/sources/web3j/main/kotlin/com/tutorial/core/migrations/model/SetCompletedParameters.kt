package com.tutorial.core.migrations.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigInteger

data class SetCompletedParameters(
    @JsonProperty(value = "completed")
    val completed: BigInteger
)
