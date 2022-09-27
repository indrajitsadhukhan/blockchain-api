package com.tutorial.core.migrations

import com.tutorial.core.migrations.model.SetCompletedParameters
import io.swagger.v3.oas.annotations.Operation
import javax.annotation.Generated
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Generated
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
interface MigrationsResource {

    @get:Path("events")
    val events: MigrationsEvents

    @GET
    @Path("last_completed_migration")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = ["Migrations Methods"], summary = "Execute the Last_completed_migration method")
    fun last_completed_migration(): org.web3j.openapi.core.models.ResultModel<java.math.BigInteger>

    @GET
    @Path("owner")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = ["Migrations Methods"], summary = "Execute the Owner method")
    fun owner(): org.web3j.openapi.core.models.ResultModel<kotlin.String>

    @POST
    @Path("setCompleted")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = ["Migrations Methods"], summary = "Execute the SetCompleted method")
    fun setCompleted(setCompletedParameters: SetCompletedParameters): org.web3j.openapi.core.models.TransactionReceiptModel
}
