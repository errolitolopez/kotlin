package com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper

import com.whitecloak.simplecrudapiusingkotlin.quotes.api.request.QuotesForm
import com.whitecloak.simplecrudapiusingkotlin.quotes.api.response.QuotesResource
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuotesEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quotes

interface QuotesMapper {

    fun mapEntityToModel(quotesEntity: QuotesEntity): Quotes
    fun mapModelToEntity(quotes: Quotes): QuotesEntity
    fun mapFormToModel(quotesForm: QuotesForm): Quotes
    fun mapModelToResource(quotes: Quotes): QuotesResource
}
