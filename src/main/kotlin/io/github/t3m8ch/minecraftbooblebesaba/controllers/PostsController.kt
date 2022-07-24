package io.github.t3m8ch.minecraftbooblebesaba.controllers

import io.github.t3m8ch.minecraftbooblebesaba.services.PostService
import io.github.t3m8ch.minecraftbooblebesaba.viewmodels.NewPostViewModel
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.view.RedirectView

@Controller
@RequestMapping("posts")
class PostsController(private val postService: PostService) {
    @GetMapping("new")
    fun newPostPage(model: Model): String {
        model.addAttribute("post", NewPostViewModel())
        return "newPost"
    }

    @PostMapping
    fun createPost(@ModelAttribute post: NewPostViewModel): RedirectView {
        postService.create(post)
        return RedirectView("/")
    }
}
