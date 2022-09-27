package com.tutorial.server

import javax.annotation.Generated
import org.web3j.openapi.server.spi.OpenApiResourceProvider

@Generated
class HelloworldProjectResourceProvider : OpenApiResourceProvider {
    override fun get() = HelloworldProjectApiImpl::class.java
}
