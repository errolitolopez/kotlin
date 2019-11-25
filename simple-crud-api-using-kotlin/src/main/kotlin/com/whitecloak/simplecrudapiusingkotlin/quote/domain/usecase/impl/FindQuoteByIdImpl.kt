package com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.impl

import com.whitecloak.simplecrudapiusingkotlin.quote.domain.gateway.QuoteGateway
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.FindQuoteById
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FindQuoteByIdImpl @Autowired constructor(
        val quoteGateway: QuoteGateway
) : FindQuoteById {

    override fun execute(id: String): Quote {
        return quoteGateway.findOneById(id)
    }
}
