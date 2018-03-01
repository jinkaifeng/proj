package com.lieluobo.proj.dal.repository

import cn.haolie.dal.querydsl.repository.AbstractRepository
import com.google.inject.Singleton
import com.lieluobo.proj.dal.generated.QUser
import com.lieluobo.proj.dal.generated.User

/**
 * Created by zhaiyz on 2018/2/22.
 */
@Singleton
class UserRepository : AbstractRepository<User, QUser>()