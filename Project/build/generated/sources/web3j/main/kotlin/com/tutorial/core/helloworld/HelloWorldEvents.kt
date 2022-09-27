package com.tutorial.core.helloworld

import com.tutorial.core.helloworld.events.ModifiedEventResource
import io.swagger.v3.oas.annotations.Operation
import javax.annotation.Generated
import javax.ws.rs.Path
import org.web3j.openapi.core.SubResource

@Generated
interface HelloWorldEvents : SubResource {

    @Operation(tags = ["HelloWorld Events"], summary = "List all HelloWorld events")
    override fun findAll(): List<String>

    @get:Path("modified")
    val modified: ModifiedEventResource
}
