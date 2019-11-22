package com.whitecloak.simplecrudapiusingkotlin.quotes.domain.usecase

import com.whitecloak.simplecrudapiusingkotlin.quotes.api.response.QuoteResource
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quote

interface CreateQuote {

    fun execute(quote: Quote): QuoteResource
}
