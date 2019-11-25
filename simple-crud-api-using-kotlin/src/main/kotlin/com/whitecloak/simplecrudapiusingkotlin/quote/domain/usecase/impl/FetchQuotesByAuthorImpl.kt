package com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.impl

import com.whitecloak.simplecrudapiusingkotlin.quote.domain.gateway.QuoteGateway
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.FetchQuotesByAuthor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FetchQuotesByAuthorImpl @Autowired constructor(
        val quoteGateway: QuoteGateway

) : FetchQuotesByAuthor {

    override fun execute(author: String): List<Quote> {
        return quoteGateway.findAllByAuthor(author)
    }
}