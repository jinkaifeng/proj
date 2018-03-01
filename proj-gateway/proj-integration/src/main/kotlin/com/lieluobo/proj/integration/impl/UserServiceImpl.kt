package com.lieluobo.proj.integration.impl

import com.google.inject.Inject
import com.google.inject.Singleton
import com.google.protobuf.util.JsonFormat
import com.lieluobo.proj.grpc.proto.AddUserRequest
import com.lieluobo.proj.grpc.proto.GetAllUserRequest
import com.lieluobo.proj.grpc.proto.User
import com.lieluobo.proj.grpc.proto.UserServiceGrpc
import com.lieluobo.proj.integration.UserService
import io.grpc.Channel
import io.grpc.netty.NegotiationType
import io.grpc.netty.NettyChannelBuilder

@Singleton
class UserServiceImpl : UserService {
    @Inject
    private lateinit var userService: UserServiceGrpc.UserServiceBlockingStub


    override fun add(name: String) {
        val request = AddUserRequest.newBuilder()
        request.name = name
        userService.add(request.build())
    }

    override fun getAll(): List<User> {
        val request = GetAllUserRequest.getDefaultInstance()
        val response = userService.getAll(request)
        println(JsonFormat.printer().print(response))
        return response.usersList
    }

}