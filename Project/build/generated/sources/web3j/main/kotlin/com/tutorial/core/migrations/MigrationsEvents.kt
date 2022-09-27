package com.tutorial.core.migrations

import io.swagger.v3.oas.annotations.Operation
import javax.annotation.Generated
import org.web3j.openapi.core.SubResource

@Generated
interface MigrationsEvents : SubResource {

    @Operation(tags = ["Migrations Events"], summary = "List all Migrations events")
    override fun findAll(): List<String>
}
