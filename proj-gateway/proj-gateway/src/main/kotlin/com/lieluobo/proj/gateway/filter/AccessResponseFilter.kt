package com.lieluobo.proj.gateway.filter

import com.google.inject.Inject
import javax.servlet.http.HttpServletResponse
import javax.ws.rs.container.ContainerRequestContext
import javax.ws.rs.container.ContainerResponseContext
import javax.ws.rs.container.ContainerResponseFilter
import javax.ws.rs.ext.Provider

/**
 * @author Microbun on 2017/6/22.
 */
@Provider
class AccessResponseFilter : ContainerResponseFilter {


    @Inject
    private lateinit var servletResponseProvider: com.google.inject.Provider<HttpServletResponse>

    override fun filter(requestContext: ContainerRequestContext?, responseContext: ContainerResponseContext?) {
        var response = servletResponseProvider.get()
        response.setHeader("Cache-Control", "no-cache")
        response.setHeader("Access-Control-Allow-Origin", "*")
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE, PATCH")
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers",
                "Origin, X-Requested-With, Content-Type, Accept,Security-Token");
        response.setHeader("Access-Control-Expose-Headers", "Location");
    }

}