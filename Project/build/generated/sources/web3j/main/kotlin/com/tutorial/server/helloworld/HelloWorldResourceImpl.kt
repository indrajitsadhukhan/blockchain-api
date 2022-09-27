package com.tutorial.server.helloworld

import com.tutorial.core.helloworld.HelloWorldEvents
import com.tutorial.core.helloworld.HelloWorldResource
import com.tutorial.core.helloworld.model.NewGreetingParameters
import com.tutorial.wrappers.HelloWorld
import kotlin.String
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.openapi.core.models.ResultModel
import org.web3j.openapi.core.models.TransactionReceiptModel

class HelloWorldResourceImpl(
    private val helloWorld: HelloWorld,
    private val uriInfo: ExtendedUriInfo
) : HelloWorldResource {
    override val events: HelloWorldEvents = HelloWorldEventsImpl(helloWorld, uriInfo)

    override fun greeting(): ResultModel<String> =
        org.web3j.openapi.core.models.ResultModel(helloWorld.greeting().send())
    override fun kill(): TransactionReceiptModel = TransactionReceiptModel(helloWorld.kill().send())
    override fun newGreeting(newGreetingParameters: NewGreetingParameters): TransactionReceiptModel =
        TransactionReceiptModel(
            helloWorld.newGreeting(
                newGreetingParameters._greet
            ).send()
        )
}
