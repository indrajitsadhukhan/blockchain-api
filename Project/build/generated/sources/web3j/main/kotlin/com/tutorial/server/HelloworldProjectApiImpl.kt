package com.tutorial.server

import com.tutorial.core.HelloworldProjectApi
import javax.annotation.Generated
import javax.inject.Inject
import javax.ws.rs.core.Context
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.crypto.Credentials
import org.web3j.openapi.server.config.ContractAddresses
import org.web3j.protocol.Web3j
import org.web3j.tx.RawTransactionManager
import org.web3j.tx.gas.ContractGasProvider

@Generated
class HelloworldProjectApiImpl @Inject constructor(
    web3j: Web3j,
    credentials: Credentials,
    gasProvider: ContractGasProvider,
    contractAddresses: ContractAddresses,
    @Context uriInfo: ExtendedUriInfo
) : HelloworldProjectApi {

    override val contracts = HelloworldProjectResourceImpl(
        web3j, RawTransactionManager(web3j, credentials), gasProvider, contractAddresses, uriInfo
    )
}
