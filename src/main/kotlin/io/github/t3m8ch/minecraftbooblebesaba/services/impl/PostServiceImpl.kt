package io.github.t3m8ch.minecraftbooblebesaba.services.impl

import io.github.t3m8ch.minecraftbooblebesaba.exceptions.PostNotFoundException
import io.github.t3m8ch.minecraftbooblebesaba.models.PostModel
import io.github.t3m8ch.minecraftbooblebesaba.services.PostService
import io.github.t3m8ch.minecraftbooblebesaba.utils.createModel
import io.github.t3m8ch.minecraftbooblebesaba.utils.mapToViewModel
import io.github.t3m8ch.minecraftbooblebesaba.viewmodels.NewPostViewModel
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.stereotype.Service

@Service
class PostServiceImpl(private val mongoTemplate: MongoTemplate) : PostService {
    override fun getAll() = mongoTemplate.query(PostModel::class.java).all().map { it.mapToViewModel() }
    override fun create(post: NewPostViewModel) = mongoTemplate.insert(post.createModel(), "Posts")
    override fun getById(id: String) =
        mongoTemplate
            .findOne(Query().addCriteria(Criteria.where("id").`is`(id)), PostModel::class.java)
            ?.mapToViewModel() ?: throw PostNotFoundException(id)
}
