package io.github.t3m8ch.minecraftbooblebesaba.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("Posts")
data class PostModel(
    @Id val id: ObjectId = ObjectId.get(),
    val title: String,
    val text: String,
)
