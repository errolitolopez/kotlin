package com.whitecloak.simplecrudapiusingkotlin.quotes.domain.usecase.impl

import com.whitecloak.simplecrudapiusingkotlin.quotes.api.response.QuotesResource
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.QuotesMapper
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.gateway.QuotesGateway
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quotes
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.usecase.CreateQuotes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CreateQuotesImpl @Autowired constructor(
        val quotesMapper: QuotesMapper,
        val quotesGateway: QuotesGateway
) : CreateQuotes {
    override fun execute(quotes: Quotes): QuotesResource {
        val createdQuotes = quotesGateway
                .createOne(quotesMapper.mapModelToEntity(quotes))
        return quotesMapper.mapModelToResource(createdQuotes)
    }
}