package com.lieluobo.proj.dal.module

import cn.haolie.dal.querydsl.AbstractDataBaseModule
import cn.haolie.dal.querydsl.type.JsonType
import com.google.inject.Provides
import com.google.inject.Singleton
import com.jolbox.bonecp.BoneCPDataSource
import com.lieluobo.proj.common.Environment
import com.querydsl.sql.Configuration
import com.querydsl.sql.MySQLTemplates
import com.querydsl.sql.SQLTemplates
import javax.sql.DataSource

/**
 * Created by zhaiyz on 2018/2/22.
 */
class DatabaseModule(isTest: Boolean = false) : AbstractDataBaseModule(isTest) {

    override fun initialize() {
    }

    override fun configuration(): Configuration {
        val templates = MySQLTemplates() as SQLTemplates
        val configuration = Configuration(templates)
        configuration.register(JsonType())
        return configuration
    }

    @Provides
    @Singleton
    fun provideDataSource(): DataSource {
        val dataSource = BoneCPDataSource()
        dataSource.driverClass = Environment.HL_JDBC_DRIVER
        dataSource.jdbcUrl = Environment.HL_JDBC_URL
        dataSource.username = Environment.HL_JDBC_USERNAME
        dataSource.password = Environment.HL_JDBC_PASSWORD
        dataSource.maxConnectionsPerPartition = Environment.HL_JDBC_POOL_SIZE
        dataSource.defaultAutoCommit = true
        return dataSource
    }
}