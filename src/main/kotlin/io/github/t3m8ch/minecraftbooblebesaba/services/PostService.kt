package io.github.t3m8ch.minecraftbooblebesaba.services

import io.github.t3m8ch.minecraftbooblebesaba.viewmodels.PostViewModel

interface PostService {
    fun getAll(): List<PostViewModel>
}
