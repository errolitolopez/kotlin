package com.whitecloak.simplecrudapiusingkotlin.quote.data.mapper

import com.whitecloak.simplecrudapiusingkotlin.quote.api.request.QuoteForm
import com.whitecloak.simplecrudapiusingkotlin.quote.api.response.QuoteResource
import com.whitecloak.simplecrudapiusingkotlin.quote.data.entity.QuoteEntity
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote

interface QuoteMapper {

    fun mapEntityToModel(quoteEntity: QuoteEntity): Quote
    fun mapModelToEntity(quote: Quote): QuoteEntity
    fun mapFormToModel(quoteForm: QuoteForm): Quote
    fun mapModelToResource(quote: Quote): QuoteResource
}
