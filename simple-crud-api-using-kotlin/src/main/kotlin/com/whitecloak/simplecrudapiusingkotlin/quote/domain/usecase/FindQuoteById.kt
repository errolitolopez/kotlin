package com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase

import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote

interface FindQuoteById {

    fun execute(id: String) : Quote
}
