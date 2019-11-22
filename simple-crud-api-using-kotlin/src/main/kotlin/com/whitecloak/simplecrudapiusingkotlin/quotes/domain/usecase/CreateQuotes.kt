package com.whitecloak.simplecrudapiusingkotlin.quotes.domain.usecase

import com.whitecloak.simplecrudapiusingkotlin.quotes.api.response.QuotesResource
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quotes

interface CreateQuotes {

    fun execute(quotes: Quotes): QuotesResource
}