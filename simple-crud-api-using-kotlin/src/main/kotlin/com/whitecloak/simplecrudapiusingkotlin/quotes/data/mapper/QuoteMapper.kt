package com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper

import com.whitecloak.simplecrudapiusingkotlin.quotes.api.request.QuoteForm
import com.whitecloak.simplecrudapiusingkotlin.quotes.api.response.QuoteResource
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuoteEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quote

interface QuoteMapper {

    fun mapEntityToModel(quoteEntity: QuoteEntity): Quote
    fun mapModelToEntity(quote: Quote): QuoteEntity
    fun mapFormToModel(quoteForm: QuoteForm): Quote
    fun mapModelToResource(quote: Quote): QuoteResource
}
