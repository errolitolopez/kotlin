package com.whitecloak.simplecrudapiusingkotlin.quote.domain.gateway

import com.whitecloak.simplecrudapiusingkotlin.quote.data.entity.QuoteEntity
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.DeleteQuote
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface QuoteGateway {

    fun createOne(quoteEntity: QuoteEntity) : Quote
    fun findOneById(id: String): Quote
    fun deleteOneById(id: String): DeleteQuote
    fun findAllByAuthor(author: String) : List<Quote>
    fun fetchPageableQuotes(page: Pageable): Page<Quote>
}
