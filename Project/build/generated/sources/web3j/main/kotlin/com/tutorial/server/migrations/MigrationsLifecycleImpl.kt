package com.tutorial.server.migrations

import com.tutorial.core.migrations.MigrationsLifecycle
import com.tutorial.wrappers.Migrations
import javax.annotation.Generated
import javax.ws.rs.Consumes
import javax.ws.rs.NotFoundException
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.abi.datatypes.Address
import org.web3j.protocol.Web3j
import org.web3j.protocol.core.methods.response.TransactionReceipt
import org.web3j.tx.TransactionManager
import org.web3j.tx.gas.ContractGasProvider

@Generated
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
class MigrationsLifecycleImpl(
    private val web3j: Web3j,
    private val transactionManager: TransactionManager,
    private val defaultGasProvider: ContractGasProvider,
    private val contractAddress: Address?,
    private val uriInfo: ExtendedUriInfo
) : MigrationsLifecycle {

    override fun deploy(): TransactionReceipt {
        val migrations = Migrations.deploy(
            web3j,
            transactionManager,
            defaultGasProvider

        ).send()

        return migrations.transactionReceipt.get()
    }

    override fun load(contractAddress: String) =
        MigrationsResourceImpl(
            Migrations.load(contractAddress, web3j, transactionManager, defaultGasProvider),
            uriInfo
        )

    override fun load() = contractAddress?.run { load(contractAddress.value) } ?: throw NotFoundException("Contract address not defined!")
}
