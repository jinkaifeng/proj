package com.lieluobo.proj.common.utils

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.lieluobo.proj.common.Environment.HL_REDIS_HOST
import com.lieluobo.proj.common.Environment.HL_REDIS_PASSWORD
import com.lieluobo.proj.common.Environment.HL_REDIS_PORT
import com.lieluobo.proj.common.Environment.HL_REDIS_TIMEOUT
import org.apache.commons.lang3.StringUtils
import redis.clients.jedis.JedisPool
import redis.clients.jedis.JedisPoolConfig


class JedisHelper(var dbIndex: Int) {

    private val config = JedisPoolConfig()

    private var jedisPool: JedisPool? = null

    init {
        config.maxTotal = 20
        config.maxIdle = 2
        config.minIdle = 0
        config.blockWhenExhausted = true
        jedisPool = JedisPool(config, HL_REDIS_HOST, HL_REDIS_PORT, HL_REDIS_TIMEOUT, HL_REDIS_PASSWORD)
    }

    private var gson: Gson = GsonBuilderUtil.instance

    operator fun <T> get(key: String, classOfT: Class<T>): T? {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            val s = it.get(key)
            if (StringUtils.isBlank(s))
                return null
            return gson.fromJson(s, classOfT)
        }
    }

    fun <T> getArray(key: String): List<T>? {
        val s = get(key)
        if (StringUtils.isEmpty(s))
            return null
        return gson.fromJson(s, object : TypeToken<List<T>>() {}.type)
    }

    operator fun get(key: String): String? {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            val s = it.get(key)
            if (StringUtils.isEmpty(s))
                return null
            return s
        }
    }

    operator fun set(key: String, obj: Any) {
        jedisPool!!.resource.use { jedis ->
            jedis.select(1)
            jedis.set(key, gson.toJson(obj))
        }
    }

    operator fun set(key: String, obj: Any, expireInSeconds: Int) {
        set(key, gson.toJson(obj), expireInSeconds)
    }

    operator fun set(key: String, value: String, expireInSeconds: Int) {
        jedisPool!!.resource.use { jedis ->
            jedis.select(dbIndex)
            jedis.set(key, value)
            jedis.expire(key, expireInSeconds)
        }
    }

    fun del(key: String) {
        jedisPool!!.resource.select(dbIndex)
        jedisPool!!.resource.del(key)
    }

}

