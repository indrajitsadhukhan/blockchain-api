package com.tutorial.server.migrations

import com.tutorial.core.migrations.MigrationsEvents
import com.tutorial.core.migrations.MigrationsResource
import com.tutorial.core.migrations.model.SetCompletedParameters
import com.tutorial.wrappers.Migrations
import java.math.BigInteger
import kotlin.String
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.openapi.core.models.ResultModel
import org.web3j.openapi.core.models.TransactionReceiptModel

class MigrationsResourceImpl(
    private val migrations: Migrations,
    private val uriInfo: ExtendedUriInfo
) : MigrationsResource {
    override val events: MigrationsEvents = MigrationsEventsImpl(migrations, uriInfo)

    override fun last_completed_migration(): ResultModel<BigInteger> =
        org.web3j.openapi.core.models.ResultModel(migrations.last_completed_migration().send())
    override fun owner(): ResultModel<String> =
        org.web3j.openapi.core.models.ResultModel(migrations.owner().send())
    override fun setCompleted(setCompletedParameters: SetCompletedParameters): TransactionReceiptModel =
        TransactionReceiptModel(
            migrations.setCompleted(
                setCompletedParameters.completed
            ).send()
        )
}
