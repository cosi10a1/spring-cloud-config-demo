package com.alphabrik.inditex.cloud.config.app

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.context.config.annotation.RefreshScope

@SpringBootApplication
@RefreshScope
class AppApplication
@Value("\${configuration.projectName}")
lateinit var test: String
fun main(args: Array<String>) {
    runApplication<AppApplication>(*args)
    println(test)
}
