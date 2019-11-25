package com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase

import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote

interface UpdateQuoteById {

    fun execute(id: String, quote: Quote): Quote
}