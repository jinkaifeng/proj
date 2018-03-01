package com.lieluobo.proj.service

import com.google.inject.Inject
import com.google.inject.Singleton
import com.lieluobo.proj.dal.generated.QUser
import com.lieluobo.proj.dal.generated.User
import com.lieluobo.proj.dal.repository.UserRepository

@Singleton
class UserService {
    @Inject
    private lateinit var userRepository: UserRepository

    fun addUser(name: String) {
        val user = User()
        user.name = name
        userRepository.insert(user)
    }

    fun getAllUsers(): List<User> {
        return userRepository.list(QUser.user.id.gt(0))
    }

}