package com.lieluobo.proj.gateway.resourse.base

import com.higgs.jersey.reinforcement.core.MediaTypeExtension
import org.slf4j.LoggerFactory
import javax.ws.rs.Produces

@Produces(MediaTypeExtension.HIGGS_JSON)
open class BaseResource {


    private val logger = LoggerFactory.getLogger(BaseResource::class.java)


}