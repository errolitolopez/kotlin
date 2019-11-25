package com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase

import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.PageableModel
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote

interface FetchPaginatedQuotes {

    fun execute(sort: String, pageNum: Int?, limit: Int?): PageableModel<Quote>
}