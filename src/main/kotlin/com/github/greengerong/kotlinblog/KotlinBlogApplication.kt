package com.github.greengerong.kotlinblog

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinBlogApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinBlogApplication::class.java, *args)
}
