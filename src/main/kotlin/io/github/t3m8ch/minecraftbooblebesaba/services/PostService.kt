package io.github.t3m8ch.minecraftbooblebesaba.services

import io.github.t3m8ch.minecraftbooblebesaba.models.PostModel
import io.github.t3m8ch.minecraftbooblebesaba.viewmodels.NewPostViewModel
import io.github.t3m8ch.minecraftbooblebesaba.viewmodels.PostViewModel

interface PostService {
    fun getAll(): List<PostViewModel>
    fun create(post: NewPostViewModel): PostModel
    fun getById(id: String): PostViewModel
}
