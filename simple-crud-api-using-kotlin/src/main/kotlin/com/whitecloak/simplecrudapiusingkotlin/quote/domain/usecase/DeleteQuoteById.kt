package com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase

import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.DeleteQuote

interface DeleteQuoteById {

    fun execute(id: String): DeleteQuote
}