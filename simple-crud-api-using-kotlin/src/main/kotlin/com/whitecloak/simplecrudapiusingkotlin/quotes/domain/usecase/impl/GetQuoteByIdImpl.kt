package com.whitecloak.simplecrudapiusingkotlin.quotes.domain.usecase.impl

import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.gateway.QuoteGateway
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quote
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.usecase.GetQuoteById
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GetQuoteByIdImpl @Autowired constructor(
        val quoteGateway: QuoteGateway
) : GetQuoteById {

    override fun execute(id: String): Quote {
        return quoteGateway.getOneById(id)
    }
}
