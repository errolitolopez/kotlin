package com.whitecloak.simplecrudapiusingkotlin.quote.data.repository

import com.whitecloak.simplecrudapiusingkotlin.quote.data.entity.QuoteEntity
import org.springframework.data.mongodb.repository.MongoRepository

interface QuoteRepository : MongoRepository<QuoteEntity, String> {

    fun findAllByAuthor(id: String): List<QuoteEntity>
}
