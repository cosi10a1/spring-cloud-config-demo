package com.alphabrik.inditex.cloud.config.app

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RefreshScope
class Controller {


    @Value("\${configuration.projectName}")
    lateinit var projectName: String

    @GetMapping("/project-name")
    fun sayConfig(): String {
        return projectName
    }
}