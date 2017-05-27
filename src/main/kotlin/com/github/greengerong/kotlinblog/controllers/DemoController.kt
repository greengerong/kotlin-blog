package com.github.greengerong.kotlinblog.controllers

import com.github.greengerong.kotlinblog.dto.Customer
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/******************************************
 *                                        *
 * Auth: green gerong                     *
 * Date: 2017                             *
 * blog: http://greengerong.github.io/    *
 * github: https://github.com/greengerong *
 *                                        *
 ******************************************/

@RestController
class DemoController() {

    var id: Long = 1

    @GetMapping("/greeting")
    fun greeting(@RequestParam("name") name: String) = Customer(id++, "Hello $name")
}