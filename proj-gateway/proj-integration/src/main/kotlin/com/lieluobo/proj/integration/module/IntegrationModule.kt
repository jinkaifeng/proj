package com.lieluobo.proj.integration.module

import com.google.inject.AbstractModule
import com.lieluobo.proj.grpc.proto.UserServiceGrpc
import io.grpc.netty.NegotiationType
import io.grpc.netty.NettyChannelBuilder

/**
 * @author Microbun on 2017/6/6.
 */

class IntegrationModule : AbstractModule() {
    override fun configure() {
        // BD服务
        val userChannel = NettyChannelBuilder.forAddress("0.0.0.0", 11000)
                .negotiationType(NegotiationType.PLAINTEXT).build()

        bind(UserServiceGrpc.UserServiceBlockingStub::class.java)
                .toInstance(UserServiceGrpc.newBlockingStub(userChannel))
    }

}