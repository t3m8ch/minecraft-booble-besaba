package io.github.t3m8ch.minecraftbooblebesaba.utils

import io.github.t3m8ch.minecraftbooblebesaba.models.PostModel
import io.github.t3m8ch.minecraftbooblebesaba.viewmodels.NewPostViewModel
import io.github.t3m8ch.minecraftbooblebesaba.viewmodels.PostViewModel

fun PostModel.mapToViewModel(): PostViewModel = PostViewModel("/posts/$id", title, text)

fun NewPostViewModel.createModel() = PostModel(title = title, text = text)
