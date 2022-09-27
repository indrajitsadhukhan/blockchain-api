package com.tutorial.server.helloworld

import com.tutorial.core.helloworld.HelloWorldEvents
import com.tutorial.server.helloworld.events.ModifiedEventResourceImpl
import com.tutorial.wrappers.HelloWorld
import javax.annotation.Generated
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.openapi.server.SubResourceImpl

@Generated
class HelloWorldEventsImpl(
    helloWorld: HelloWorld,
    uriInfo: ExtendedUriInfo
) : HelloWorldEvents, SubResourceImpl(uriInfo) {

    override val modified = ModifiedEventResourceImpl(helloWorld)
}
