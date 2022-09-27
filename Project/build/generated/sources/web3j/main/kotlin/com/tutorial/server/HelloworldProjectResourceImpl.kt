package com.tutorial.server

import com.tutorial.core.HelloworldProjectResource
import com.tutorial.server.helloworld.HelloWorldLifecycleImpl
import com.tutorial.server.migrations.MigrationsLifecycleImpl
import com.tutorial.server.mortal.MortalLifecycleImpl
import com.tutorial.server.todolist.TodoListLifecycleImpl
import javax.annotation.Generated
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.openapi.server.SubResourceImpl
import org.web3j.openapi.server.config.ContractAddresses
import org.web3j.protocol.Web3j
import org.web3j.tx.TransactionManager
import org.web3j.tx.gas.ContractGasProvider

@Generated
class HelloworldProjectResourceImpl(
    web3j: Web3j,
    transactionManager: TransactionManager,
    defaultGasProvider: ContractGasProvider,
    contractAddresses: ContractAddresses,
    uriInfo: ExtendedUriInfo
) : HelloworldProjectResource, SubResourceImpl(uriInfo) {

    override val helloWorld = HelloWorldLifecycleImpl(
        web3j,
        transactionManager,
        defaultGasProvider,
        contractAddresses["helloworld"],
        uriInfo
    )

    override val migrations = MigrationsLifecycleImpl(
        web3j,
        transactionManager,
        defaultGasProvider,
        contractAddresses["migrations"],
        uriInfo
    )

    override val mortal = MortalLifecycleImpl(
        web3j,
        transactionManager,
        defaultGasProvider,
        contractAddresses["mortal"],
        uriInfo
    )

    override val todoList = TodoListLifecycleImpl(
        web3j,
        transactionManager,
        defaultGasProvider,
        contractAddresses["todolist"],
        uriInfo
    )
}
