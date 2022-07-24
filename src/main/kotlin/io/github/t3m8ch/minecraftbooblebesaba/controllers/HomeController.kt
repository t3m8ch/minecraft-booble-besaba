package io.github.t3m8ch.minecraftbooblebesaba.controllers

import io.github.t3m8ch.minecraftbooblebesaba.services.PostService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController(private val postService: PostService) {
    @GetMapping
    fun getHome(model: Model): String {
        model.addAttribute("posts", postService.getAll())
        return "index"
    }
}
