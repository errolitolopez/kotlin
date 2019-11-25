package com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.impl

import com.whitecloak.simplecrudapiusingkotlin.quote.data.mapper.QuoteMapper
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.gateway.QuoteGateway
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.CreateQuote
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CreateQuoteImpl @Autowired constructor(
        val quoteMapper: QuoteMapper,
        val quoteGateway: QuoteGateway
) : CreateQuote {
    override fun execute(quote: Quote): Quote {
        return quoteGateway.createOne(quoteMapper.mapModelToEntity(quote))
    }
}
