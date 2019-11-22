package com.whitecloak.simplecrudapiusingkotlin.quotes.domain.gateway

import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuoteEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quote

interface QuoteGateway {

    fun createOne(quoteEntity: QuoteEntity) : Quote
    fun getOneById(id: String): Quote
}
