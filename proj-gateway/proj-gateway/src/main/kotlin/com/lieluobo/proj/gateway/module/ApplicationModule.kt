package com.lieluobo.proj.gateway.module

import com.google.inject.AbstractModule
import com.google.inject.Singleton
import com.lieluobo.proj.grpc.proto.UserServiceGrpc
import com.lieluobo.proj.integration.UserService
import com.lieluobo.proj.integration.impl.UserServiceImpl
import io.peggy.core.channel
import io.peggy.core.interceptor.TimeoutInterceptor
import io.peggy.tracing.instance
import java.util.concurrent.TimeUnit

/**
 * @author Microbun on 2017/6/6.
 */

class ApplicationModule : AbstractModule() {
    override fun configure() {
        bind(UserService::class.java).to(UserServiceImpl::class.java).`in`(Singleton::class.java)
    }

}