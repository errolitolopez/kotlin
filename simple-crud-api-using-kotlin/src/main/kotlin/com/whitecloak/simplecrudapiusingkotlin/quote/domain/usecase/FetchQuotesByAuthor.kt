package com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase

import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote

interface FetchQuotesByAuthor {

    fun execute(author: String): List<Quote>
}