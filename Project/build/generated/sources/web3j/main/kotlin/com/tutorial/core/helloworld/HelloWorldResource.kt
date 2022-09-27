package com.tutorial.core.helloworld

import com.tutorial.core.helloworld.model.NewGreetingParameters
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
interface HelloWorldResource {

    @get:Path("events")
    val events: HelloWorldEvents

    @GET
    @Path("greeting")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = ["HelloWorld Methods"], summary = "Execute the Greeting method")
    fun greeting(): org.web3j.openapi.core.models.ResultModel<kotlin.String>

    @GET
    @Path("kill")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = ["HelloWorld Methods"], summary = "Execute the Kill method")
    fun kill(): org.web3j.openapi.core.models.TransactionReceiptModel

    @POST
    @Path("newGreeting")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = ["HelloWorld Methods"], summary = "Execute the NewGreeting method")
    fun newGreeting(newGreetingParameters: NewGreetingParameters): org.web3j.openapi.core.models.TransactionReceiptModel
}
