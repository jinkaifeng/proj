package com.lieluobo.proj.gateway.resourse

import cn.haolie.common.Pagination
import com.google.inject.Inject
import com.higgs.jersey.reinforcement.exception.ResourceException
import com.lieluobo.proj.gateway.resourse.base.BaseResource
import com.lieluobo.proj.gateway.vo.UserVo
import com.lieluobo.proj.integration.UserService
import io.swagger.annotations.Api
import org.slf4j.LoggerFactory
import javax.ws.rs.GET
import javax.ws.rs.Path


/**
 * @author Microbun on 2017/5/17.
 */

@Path("/user")
@Api("用户管理")
open class UserResource : BaseResource() {

    private val logger = LoggerFactory.getLogger(UserResource::class.java)

    @Inject
    private lateinit var userService: UserService

    @GET
    @Path("users")
    open fun stats(): List<UserVo> {
        logger.info("查询全部用户开始")
        return userService.getAll().map {
            val item = UserVo()
            item.id = it.id
            item.name = it.name
            item
        }
    }

    @GET
    @Path("users/page")
    open fun pages(): Pagination<UserVo> {
        logger.info("分页查询全部用户开始")
        val users = userService.getAll().map {
            val item = UserVo()
            item.id = it.id
            item.name = it.name
            item
        }
        return Pagination(1, 20, 5, users)
    }

    @GET
    @Path("users/exception")
    open fun exception(): Pagination<UserVo> {
        logger.info("查询全部用户异常")
        throw ResourceException(999999, "s123456")
    }

    @GET
    @Path("index")
    open fun index(): String {
        logger.info("index")
        return "111"
    }


}