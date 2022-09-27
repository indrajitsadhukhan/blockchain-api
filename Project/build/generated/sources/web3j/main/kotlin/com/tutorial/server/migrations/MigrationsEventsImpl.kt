package com.tutorial.server.migrations

import com.tutorial.core.migrations.MigrationsEvents
import com.tutorial.wrappers.Migrations
import javax.annotation.Generated
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.openapi.server.SubResourceImpl

@Generated
class MigrationsEventsImpl(
    migrations: Migrations,
    uriInfo: ExtendedUriInfo
) : MigrationsEvents, SubResourceImpl(uriInfo)
