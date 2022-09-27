package com.tutorial.core

import com.tutorial.core.helloworld.HelloWorldLifecycle
import com.tutorial.core.migrations.MigrationsLifecycle
import com.tutorial.core.mortal.MortalLifecycle
import com.tutorial.core.todolist.TodoListLifecycle
import javax.annotation.Generated
import javax.ws.rs.Consumes
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import org.web3j.openapi.core.SubResource

@Generated
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
interface HelloworldProjectResource : SubResource {

    @get:Path("helloworld")
    val helloWorld: HelloWorldLifecycle

    @get:Path("migrations")
    val migrations: MigrationsLifecycle

    @get:Path("mortal")
    val mortal: MortalLifecycle

    @get:Path("todolist")
    val todoList: TodoListLifecycle
}
