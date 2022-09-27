package com.tutorial.core.migrations

import io.swagger.v3.oas.annotations.Operation
import javax.annotation.Generated
import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import org.web3j.openapi.core.CONTRACT_ADDRESS
import org.web3j.openapi.core.CONTRACT_ADDRESS_PATH
import org.web3j.protocol.core.methods.response.TransactionReceipt

@Generated
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
interface MigrationsLifecycle {

    @POST
    @Operation(
        tags = ["Migrations Methods"],
        summary = "Deploys the Migrations contract"
    )
    fun deploy(): TransactionReceipt

    @Path(CONTRACT_ADDRESS_PATH)
    @Operation(
        tags = ["Migrations Methods"],
        summary = "Loads the Migrations contract"
    )
    fun load(
        @PathParam(CONTRACT_ADDRESS)
        contractAddress: String
    ): MigrationsResource

    @Path("default")
    @Operation(
        tags = ["Migrations Methods"],
        summary = "Loads the Migrations contract with predefined address"
    )
    fun load(): MigrationsResource
}
