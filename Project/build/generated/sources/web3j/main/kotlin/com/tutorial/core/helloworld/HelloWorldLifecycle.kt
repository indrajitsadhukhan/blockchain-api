package com.tutorial.core.helloworld

import com.tutorial.core.helloworld.model.HelloWorldDeployParameters
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
interface HelloWorldLifecycle {

    @POST
    @Operation(
        tags = ["HelloWorld Methods"],
        summary = "Deploys the HelloWorld contract"
    )
    fun deploy(parameters: HelloWorldDeployParameters): TransactionReceipt

    @Path(CONTRACT_ADDRESS_PATH)
    @Operation(
        tags = ["HelloWorld Methods"],
        summary = "Loads the HelloWorld contract"
    )
    fun load(
        @PathParam(CONTRACT_ADDRESS)
        contractAddress: String
    ): HelloWorldResource

    @Path("default")
    @Operation(
        tags = ["HelloWorld Methods"],
        summary = "Loads the HelloWorld contract with predefined address"
    )
    fun load(): HelloWorldResource
}
