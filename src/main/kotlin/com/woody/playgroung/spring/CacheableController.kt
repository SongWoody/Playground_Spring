package com.woody.playgroung.spring

import org.springframework.cache.annotation.Cacheable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicInteger

@RestController
class CacheableController {
    val counter = AtomicInteger()
    val cacheableCounter = AtomicInteger()

    @GetMapping("/count")
    fun getCount(): String {
        println("## call getCounter()")
        return "counter ${counter.incrementAndGet()}"
    }

    @GetMapping("/cacheableCount")
    @Cacheable("myCount")
    fun getCacheableCount(): String {
        println("## call getCounter()")
        return "cacheableCounter ${cacheableCounter.incrementAndGet()}"
    }
}