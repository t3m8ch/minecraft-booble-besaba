package io.github.t3m8ch.minecraftbooblebesaba.services.impl

import io.github.t3m8ch.minecraftbooblebesaba.models.PostModel
import io.github.t3m8ch.minecraftbooblebesaba.services.PostService
import io.github.t3m8ch.minecraftbooblebesaba.utils.mapToViewModel
import io.github.t3m8ch.minecraftbooblebesaba.viewmodels.PostViewModel
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Query
import org.springframework.stereotype.Service

@Service
class PostServiceImpl(private val mongoTemplate: MongoTemplate) : PostService {
    override fun getAll() = mongoTemplate.query(PostModel::class.java).all().map { it.mapToViewModel() }
}
