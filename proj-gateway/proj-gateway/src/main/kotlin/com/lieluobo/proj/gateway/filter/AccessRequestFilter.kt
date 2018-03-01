package com.lieluobo.proj.gateway.filter

import com.google.inject.Inject
import org.slf4j.LoggerFactory
import javax.servlet.http.HttpServletRequest
import javax.ws.rs.container.ContainerRequestContext
import javax.ws.rs.container.ContainerRequestFilter
import javax.ws.rs.ext.Provider

/**
 * @author Microbun on 2017/6/22.
 */
@Provider
class AccessRequestFilter : ContainerRequestFilter {

    private val logger = LoggerFactory.getLogger(AccessRequestFilter::class.java)

    @Inject
    private lateinit var servletRequestProvider: com.google.inject.Provider<HttpServletRequest>

    override fun filter(requestContext: ContainerRequestContext?) {
        var request = servletRequestProvider.get()
        logger.info("filter 参数：${request.requestURI}")
        logger.info("filter 参数：${request.method}")
        logger.info("filter 参数：${request.cookies}")
    }
}