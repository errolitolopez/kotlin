package com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper

import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuotesEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quotes

interface QuotesMapper {

    fun map(quotes: Quotes): QuotesEntity
    fun map(quotesEntity: QuotesEntity): Quotes
}
