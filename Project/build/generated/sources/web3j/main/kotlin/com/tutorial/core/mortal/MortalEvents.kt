package com.tutorial.core.mortal

import io.swagger.v3.oas.annotations.Operation
import javax.annotation.Generated
import org.web3j.openapi.core.SubResource

@Generated
interface MortalEvents : SubResource {

    @Operation(tags = ["Mortal Events"], summary = "List all Mortal events")
    override fun findAll(): List<String>
}
