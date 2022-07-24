package io.github.t3m8ch.minecraftbooblebesaba.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.NOT_FOUND)
class PostNotFoundException(id: String) : Exception("Post with ID = $id not found")
