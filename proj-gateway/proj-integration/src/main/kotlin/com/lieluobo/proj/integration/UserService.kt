package com.lieluobo.proj.integration

import com.lieluobo.proj.grpc.proto.User

interface UserService {

    fun add(name: String)

    fun getAll(): List<User>
}