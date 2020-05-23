package com.alphabrik.inditex.cloud.config.app

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "configuration")
class PropertyConfiguration {
    var projectName: String = "default"
}