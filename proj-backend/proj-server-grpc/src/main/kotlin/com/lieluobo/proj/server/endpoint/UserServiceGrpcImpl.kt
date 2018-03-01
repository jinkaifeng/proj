package com.lieluobo.proj.server.endpoint

import com.google.inject.Inject
import com.lieluobo.proj.grpc.proto.*
import com.lieluobo.proj.service.UserService
import io.grpc.stub.StreamObserver
import io.peggy.core.annotation.Endpoint
import io.peggy.core.ext.with
import org.slf4j.LoggerFactory

/**
 * Created by zhaiyz on 2018/2/22.
 */
@Endpoint
class UserServiceGrpcImpl : UserServiceGrpc.UserServiceImplBase() {

    private val logger = LoggerFactory.getLogger(UserServiceGrpcImpl::class.java)

    @Inject
    private lateinit var userService: UserService

    override fun add(request: AddUserRequest, responseObserver: StreamObserver<AddUserResponse>) {
        logger.info("添加用户开始 参数：${request.name}")
        responseObserver.with {
            val name = request.name
            userService.addUser(name)
            AddUserResponse.getDefaultInstance()
        }
    }

    override fun getAll(request: GetAllUserRequest, responseObserver: StreamObserver<GetAllUserResponse>) {
        logger.info("查询所有用户开始")
        responseObserver.with {
            val users = userService.getAllUsers()

            val items = users.map {
                val item = User.newBuilder()
                item.id = it.id
                item.name = it.name
                item.build()
            }

            GetAllUserResponse.newBuilder().addAllUsers(items).build()
        }
    }
}