package com.lieluobo.kgq

import cn.haolie.dal.querydsl.TransactionSqlFactory
import com.lieluobo.proj.dal.module.DatabaseModule
import com.lieluobo.proj.server.Application
import io.grpc.Channel
import io.grpc.Server
import io.grpc.netty.NegotiationType
import io.grpc.netty.NettyChannelBuilder
import io.peggy.PeggyServer
import org.testng.annotations.AfterSuite
import org.testng.annotations.BeforeSuite

/**
 * Created by zhaiyz on 2018/2/22.
 */
open class GrpcBaseTest {

    private val port = "11000"

    private lateinit var server: Server

    private lateinit var factory: TransactionSqlFactory

    val channel: Channel = NettyChannelBuilder.forAddress("0.0.0.0", port.toInt())
            .negotiationType(NegotiationType.PLAINTEXT).build()

//    @BeforeSuite
//    fun boot() {
//        System.setProperty("server.port", port)
//        val peggy = PeggyServer(Application::class.java, DatabaseModule(true))
//        peggy.injector.injectMembers(this)
//        factory = peggy.injector.getInstance(TransactionSqlFactory::class.java)
//        server = peggy.get()
//        server.start()
//    }
//
//    @AfterSuite
//    fun shutdown() {
//        server.shutdownNow()
//    }
}