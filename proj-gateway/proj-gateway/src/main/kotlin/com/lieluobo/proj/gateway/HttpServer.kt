package com.lieluobo.proj.gateway

import com.higgs.jersey.reinforcement.JerseyServer
import com.higgs.jersey.reinforcement.module.JerseyResourceConfig
import com.lieluobo.proj.common.constant.Environment.HL_SERVER_PORT
import com.lieluobo.proj.gateway.filter.AccessRequestFilter
import com.lieluobo.proj.gateway.filter.AccessResponseFilter
import com.lieluobo.proj.gateway.module.ApplicationModule
import com.lieluobo.proj.integration.module.IntegrationModule
import org.glassfish.jersey.server.model.Resource


/**
 * The type Http rest server.
 * @author Microbun on 17/5/17.
 */
class TemplateConfig : JerseyResourceConfig() {
    override fun configuration() {
        this.debug = true
        packages("com.lieluobo.proj.gateway")
        register(AccessRequestFilter::class.java)
        register(AccessResponseFilter::class.java)
        register(io.swagger.jaxrs.listing.ApiListingResource::class.java)
        register(io.swagger.jaxrs.listing.SwaggerSerializers::class.java)
    }
}

fun main(args: Array<String>) {
    JerseyServer(TemplateConfig(), ApplicationModule(), IntegrationModule()).start(HL_SERVER_PORT)
}
