package com.whitecloak.simplecrudapiusingkotlin.quotes.data.repository

import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuoteEntity

interface QuoteRepository {

    fun save(quoteEntity: QuoteEntity): QuoteEntity
    fun findById(id: String): QuoteEntity
}
