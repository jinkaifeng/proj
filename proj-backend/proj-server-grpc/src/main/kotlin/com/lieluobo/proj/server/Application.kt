package com.lieluobo.proj.server

import cn.haolie.common.SystemTool
import com.lieluobo.proj.common.Environment
import com.lieluobo.proj.dal.module.DatabaseModule
import io.peggy.PeggyServer
import io.peggy.core.annotation.PeggyServerApplication
import io.peggy.core.util.shutdownHook

/**
 * Created by zhaiyz on 2018/2/22.
 */
@PeggyServerApplication(name = "kgq-demo", scan = "com.lieluobo.kgq.endpoint")
class Application {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            System.setProperty("server.port", Environment.HL_SERVER_PORT)
            val server = PeggyServer(Application::class.java, DatabaseModule())
            shutdownHook { server.get().shutdown() }
            server.get().start().awaitTermination()
        }
    }
}