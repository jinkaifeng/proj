package com.lieluobo.kgq

import com.google.protobuf.util.JsonFormat
import com.lieluobo.proj.grpc.proto.AddUserRequest
import com.lieluobo.proj.grpc.proto.GetAllUserRequest
import com.lieluobo.proj.grpc.proto.UserServiceGrpc
import org.testng.annotations.Test

/**
 * Created by zhaiyz on 2018/2/22.
 */
class UserServiceGrpcImplTest : GrpcBaseTest() {

    private val userService = UserServiceGrpc.newBlockingStub(channel)

    @Test
    fun testAdd() {
        val request = AddUserRequest.newBuilder()
        request.name = "zhaiyz${System.currentTimeMillis()}"
        userService.add(request.build())
    }

    @Test
    fun testGetAll() {
        val request = GetAllUserRequest.getDefaultInstance()
        val response = userService.getAll(request)
        println(JsonFormat.printer().print(response))
    }
}