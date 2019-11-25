package com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase

import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote

interface CreateQuote {

    fun execute(quote: Quote): Quote
}
