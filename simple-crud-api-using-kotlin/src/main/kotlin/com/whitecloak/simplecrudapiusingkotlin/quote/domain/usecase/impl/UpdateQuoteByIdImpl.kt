package com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.impl

import com.whitecloak.simplecrudapiusingkotlin.quote.data.mapper.QuoteMapper
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.gateway.QuoteGateway
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.UpdateQuoteById
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UpdateQuoteByIdImpl @Autowired constructor(
        val quoteMapper: QuoteMapper,
        val quoteGateway: QuoteGateway
) : UpdateQuoteById {

    override fun execute(id: String,
                         quote: Quote): Quote {

        val toBeUpdatedQuote = quoteGateway.findOneById(id)
        toBeUpdatedQuote.body = quote.body
        toBeUpdatedQuote.author = quote.author

        return quoteGateway.createOne(quoteMapper.mapModelToEntity(toBeUpdatedQuote))
    }
}