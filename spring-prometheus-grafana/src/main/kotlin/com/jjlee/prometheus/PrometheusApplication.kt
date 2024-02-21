package com.jjlee.prometheus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class PrometheusApplication

fun main(args: Array<String>) {
	runApplication<PrometheusApplication>(*args)
}
