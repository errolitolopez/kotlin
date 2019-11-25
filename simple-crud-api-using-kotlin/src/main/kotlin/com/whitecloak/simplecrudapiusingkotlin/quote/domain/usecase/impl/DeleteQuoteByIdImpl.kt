package com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.impl

import com.whitecloak.simplecrudapiusingkotlin.quote.domain.gateway.QuoteGateway
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.DeleteQuote
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.DeleteQuoteById
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DeleteQuoteByIdImpl @Autowired constructor(
        val quoteGateway: QuoteGateway
) : DeleteQuoteById {

    override fun execute(id: String): DeleteQuote {
        return quoteGateway.deleteOneById(id)
    }
}