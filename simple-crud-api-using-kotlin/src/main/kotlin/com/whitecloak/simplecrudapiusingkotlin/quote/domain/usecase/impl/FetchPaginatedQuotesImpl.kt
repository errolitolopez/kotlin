package com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.impl

import com.whitecloak.simplecrudapiusingkotlin.quote.domain.gateway.QuoteGateway
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.PageableModel
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.FetchPaginatedQuotes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class FetchPaginatedQuotesImpl @Autowired constructor(
        val quoteGateway: QuoteGateway
) : FetchPaginatedQuotes {

    override fun execute(pageNum: Int?, limit: Int?): PageableModel<Quote> {

        val pageable: Pageable = PageRequest.of(pageNum!!.minus(1), limit!!)
        val pageableQuotes = quoteGateway.fetchPageableQuotes(pageable)

        return PageableModel(
                pageableQuotes.toList(),
                pageNum,
                limit,
                pageableQuotes.totalPages,
                pageableQuotes.totalElements.toInt()
        )
    }
}