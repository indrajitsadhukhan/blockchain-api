package com.tutorial.server.todolist

import com.tutorial.core.todolist.TodoListLifecycle
import com.tutorial.wrappers.TodoList
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
class TodoListLifecycleImpl(
    private val web3j: Web3j,
    private val transactionManager: TransactionManager,
    private val defaultGasProvider: ContractGasProvider,
    private val contractAddress: Address?,
    private val uriInfo: ExtendedUriInfo
) : TodoListLifecycle {

    override fun deploy(): TransactionReceipt {
        val todoList = TodoList.deploy(
            web3j,
            transactionManager,
            defaultGasProvider

        ).send()

        return todoList.transactionReceipt.get()
    }

    override fun load(contractAddress: String) =
        TodoListResourceImpl(
            TodoList.load(contractAddress, web3j, transactionManager, defaultGasProvider),
            uriInfo
        )

    override fun load() = contractAddress?.run { load(contractAddress.value) } ?: throw NotFoundException("Contract address not defined!")
}
