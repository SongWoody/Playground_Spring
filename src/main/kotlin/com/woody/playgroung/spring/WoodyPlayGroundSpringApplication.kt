package com.woody.playgroung.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class WoodyPlayGroundSpringApplication

fun main(args: Array<String>) {
	runApplication<WoodyPlayGroundSpringApplication>(*args)
}
