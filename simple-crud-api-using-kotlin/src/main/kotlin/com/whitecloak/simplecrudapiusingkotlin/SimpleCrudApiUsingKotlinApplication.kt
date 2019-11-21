package com.whitecloak.simplecrudapiusingkotlin

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleCrudApiUsingKotlinApplication

private val log = LoggerFactory.getLogger(SimpleCrudApiUsingKotlinApplication::class.java)

fun main(args: Array<String>) {
    runApplication<SimpleCrudApiUsingKotlinApplication>(*args)
    log.info("Hello Kotlin!")

}
