package com.whitecloak.simplecrudapiusingkotlin.quotes.domain.gateway

import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuotesEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quotes

interface QuotesGateway {

    fun createOne(quotesEntity: QuotesEntity) : Quotes
}
