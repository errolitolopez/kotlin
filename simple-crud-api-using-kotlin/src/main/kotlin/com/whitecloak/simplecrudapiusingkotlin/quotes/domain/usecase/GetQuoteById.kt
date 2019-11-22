package com.whitecloak.simplecrudapiusingkotlin.quotes.domain.usecase

import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quote

interface GetQuoteById {

    fun execute(id: String) : Quote
}
