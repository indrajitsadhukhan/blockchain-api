package com.tutorial.server.mortal

import com.tutorial.core.mortal.MortalEvents
import com.tutorial.wrappers.Mortal
import javax.annotation.Generated
import org.glassfish.jersey.server.ExtendedUriInfo
import org.web3j.openapi.server.SubResourceImpl

@Generated
class MortalEventsImpl(
    mortal: Mortal,
    uriInfo: ExtendedUriInfo
) : MortalEvents, SubResourceImpl(uriInfo)
