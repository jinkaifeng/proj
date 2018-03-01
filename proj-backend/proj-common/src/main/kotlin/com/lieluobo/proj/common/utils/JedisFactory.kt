package com.lieluobo.proj.common.utils

object JedisFactory {

    /**
     * 平台公共缓存
     */
    val commonCacheRedisManager = JedisHelper(1)

    /**
     * 会话缓存
     */
    val sessionCacheRedisManager = JedisHelper(2)

    /**
     * 默认缓存
     */
    val defaultCacheRedisManager = JedisHelper(3)
}
//
//data class User(var name: String, var mobile: String, var phone: String, var x: String)
//
//fun main(args: Array<String>) {
//    val user = User("111", "2222", "333", "444")
//    JedisFactory.commonCacheRedisManager["111", user] = 123
//    val s = JedisFactory.commonCacheRedisManager["111", User::class.java]
//    println(JedisFactory.commonCacheRedisManager["222222"])
//    println(s)
//}