package com.tutorial.core.mortal

import io.swagger.v3.oas.annotations.Operation
import javax.annotation.Generated
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Generated
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
interface MortalResource {

    @get:Path("events")
    val events: MortalEvents

    @GET
    @Path("kill")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = ["Mortal Methods"], summary = "Execute the Kill method")
    fun kill(): org.web3j.openapi.core.models.TransactionReceiptModel
}
