package com.lieluobo.proj.common.constant

import cn.haolie.common.SystemTool

/**
 * Created by zhaiyz on 2018/2/22.
 */
object Environment {

//    val HL_JDBC_DRIVER = SystemTool.env("HL_JDBC_DRIVER", "com.mysql.jdbc.Driver")
//    val HL_JDBC_URL = SystemTool.env("HL_JDBC_URL", "jdbc:mysql://172.16.52.81:3306/dev")
//    val HL_JDBC_USERNAME = SystemTool.env("HL_JDBC_USERNAME", "dev")
//    val HL_JDBC_PASSWORD = SystemTool.env("HL_JDBC_PASSWORD", "haolie123")
//    val HL_JDBC_POOL_SIZE = SystemTool.env("HL_JDBC_POOL_SIZE", 3)
//    val HL_JDBC_JMX = SystemTool.env("HL_JDBC_JMX", false)
//    val HL_JDBC_CONNECTION_TIMEOUT = SystemTool.env("HL_JDBC_CONNECTION_TIMEOUT", 2000).toLong()
//

    val HL_SERVER_PORT = SystemTool.env("HL_SERVER_PORT", 8000)

    val HL_REDIS_HOST = SystemTool.env("HL_REDIS_HOST", "localhost")
    val HL_REDIS_PORT = SystemTool.env("HL_REDIS_PORT", 6539)
    val HL_REDIS_TIMEOUT = SystemTool.env("HL_REDIS_TIMEOUT", 2000)
    val HL_REDIS_PASSWORD = SystemTool.env("HL_SERVER_PORT", "fruit@123")


}