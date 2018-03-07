package com.lieluobo.proj.common.utils

import com.google.common.collect.Maps
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.lieluobo.proj.common.constant.Environment.HL_REDIS_HOST
import com.lieluobo.proj.common.constant.Environment.HL_REDIS_PASSWORD
import com.lieluobo.proj.common.constant.Environment.HL_REDIS_PORT
import com.lieluobo.proj.common.constant.Environment.HL_REDIS_TIMEOUT
import org.apache.commons.lang3.StringUtils
import redis.clients.jedis.JedisPool
import redis.clients.jedis.JedisPoolConfig


class JedisHelper(private var dbIndex: Int) {

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

    /**
     * 取得指定类型
     */
    operator fun <T> get(key: String, classOfT: Class<T>): T? {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            val s = it.get(key)
            if (StringUtils.isBlank(s))
                return null
            return gson.fromJson(s, classOfT)
        }
    }

    /**
     * 取得列表
     */
    fun <T> getArray(key: String): List<T>? {
        val s = get(key)
        if (StringUtils.isEmpty(s))
            return null
        return gson.fromJson(s, object : TypeToken<List<T>>() {}.type)
    }

    /**
     * 取得string
     */
    operator fun get(key: String): String? {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            val s = it.get(key)
            if (StringUtils.isEmpty(s))
                return null
            return s
        }
    }

    /**
     * 设置任何类型
     */
    operator fun set(key: String, obj: Any) {
        jedisPool!!.resource.use { jedis ->
            jedis.select(1)
            jedis.set(key, gson.toJson(obj))
        }
    }

    /**
     * 设置任何类型 在指定时间内过期
     */
    operator fun set(key: String, obj: Any, expireInSeconds: Int) {
        set(key, gson.toJson(obj), expireInSeconds)
    }

    /**
     * 设置string 在指定时间内过期
     */
    operator fun set(key: String, value: String, expireInSeconds: Int) {
        jedisPool!!.resource.use { jedis ->
            jedis.select(dbIndex)
            jedis.set(key, value)
            jedis.expire(key, expireInSeconds)
        }
    }

    /**
     * 删除key
     */
    fun del(key: String) {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            it.del(key)
        }
    }

    fun hSet(key: String, field: String, obj: Any) {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            it.hset(key, field, gson.toJson(obj))
        }
    }

    fun hSet(key: String, field: String, obj: Any, expireInSeconds: Int) {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            it.expire(key, expireInSeconds)
            it.hset(key, field, gson.toJson(obj))
        }
    }

    fun <T> hGet(key: String, field: String, classOfT: Class<T>): T? {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            val s = it.hget(key, field)
            if (StringUtils.isEmpty(s)) {
                return null
            }
            return gson.fromJson(s, classOfT)
        }
    }

    fun hGet(key: String, field: String): String? {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            val s = it.hget(key, field)
            if (StringUtils.isEmpty(s)) {
                return null
            }
            return s
        }
    }

    fun hdel(key: String, field: String) {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            it.hdel(key, field)
        }
    }

    fun <T> hGetArray(key: String, field: String): T? {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            val s = it.hget(key, field)
            if (StringUtils.isEmpty(s)) {
                return null
            }
            return gson.fromJson(s, object : TypeToken<List<T>>() {}.type)
        }
    }

    fun <T> hGetAll(key: String, classOfT: Class<T>): Map<String, T>? {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            val s = it.hgetAll(key)
            if (s.isEmpty()) {
                return null
            }
            var map = Maps.newLinkedHashMap<String, T>()
            s.map { map.put(it.key, gson.fromJson(it.value, classOfT)) }
            return map
        }
    }

    fun hGetAll(key: String): Map<String, String>? {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            val s = it.hgetAll(key)
            if (s.isEmpty()) {
                return null
            }
            return s
        }
    }

    fun <T> hGetAllArray(key: String): Map<String, List<T>>? {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            val s = it.hgetAll(key)
            if (s.isEmpty()) {
                return null
            }
            val map = Maps.newLinkedHashMap<String, List<T>>()
            s.map { map.put(it.key, gson.fromJson(it.value, object : TypeToken<List<T>>() {}.type)) }
            return map
        }
    }

    fun lPush(key: String, obj: Any) {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            it.lpush(key, gson.toJson(obj))
        }
    }

    fun <T> rPop(key: String, classOfT: Class<T>): T? {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            val s = it.rpop(key)
            if (StringUtils.isEmpty(s)) {
                return null
            }
            return gson.fromJson(s, classOfT)
        }
    }

    fun rPop(key: String): String? {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            return it.rpop(key)
        }
    }

    fun <T> rPopArray(key: String): List<T>? {
        jedisPool!!.resource.use {
            it.select(dbIndex)
            val s = it.rpop(key)
            if (s.isEmpty()) {
                return null
            }
            return gson.fromJson(s, object : TypeToken<List<T>>() {}.type)
        }
    }

}