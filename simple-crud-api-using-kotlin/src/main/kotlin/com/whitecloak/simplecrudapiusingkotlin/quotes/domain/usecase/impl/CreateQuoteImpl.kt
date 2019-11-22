package com.whitecloak.simplecrudapiusingkotlin.quotes.domain.usecase.impl

import com.whitecloak.simplecrudapiusingkotlin.quotes.api.response.QuoteResource
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.QuoteMapper
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.gateway.QuoteGateway
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quote
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.usecase.CreateQuote
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CreateQuoteImpl @Autowired constructor(
        val quoteMapper: QuoteMapper,
        val quoteGateway: QuoteGateway
) : CreateQuote {
    override fun execute(quote: Quote): QuoteResource {
        val createdQuote = quoteGateway
                .createOne(quoteMapper.mapModelToEntity(quote))
        return quoteMapper.mapModelToResource(createdQuote)
    }
}
