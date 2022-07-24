package io.github.t3m8ch.minecraftbooblebesaba.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {
    @GetMapping
    fun getHome(): String {
        return "index"
    }
}
