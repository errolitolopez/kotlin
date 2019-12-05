package com.whitecloak.simplecrudapiusingkotlin

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SimpleCrudApiUsingKotlinApplication {

    @Bean
    fun init(): CommandLineRunner = CommandLineRunner {

    }

}

fun main(args: Array<String>) {
    runApplication<SimpleCrudApiUsingKotlinApplication>(*args)
}
