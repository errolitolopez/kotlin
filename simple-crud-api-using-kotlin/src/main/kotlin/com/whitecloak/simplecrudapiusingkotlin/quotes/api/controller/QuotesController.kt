package com.whitecloak.simplecrudapiusingkotlin.quotes.api.controller

import com.whitecloak.simplecrudapiusingkotlin.quotes.api.request.QuoteForm
import com.whitecloak.simplecrudapiusingkotlin.quotes.api.response.QuoteResource
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.QuoteMapper
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.usecase.CreateQuote
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.usecase.GetQuoteById
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping(path = ["/api/quotes"])
class QuotesController @Autowired constructor(
        val quoteMapper: QuoteMapper,
        val createQuote: CreateQuote,
        val getQuoteById: GetQuoteById
) {

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    fun createQuote(@Valid @RequestBody quoteForm: QuoteForm): QuoteResource {
        return createQuote.execute(quoteMapper.mapFormToModel(quoteForm))
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getQuoteById(@Valid @PathVariable id: String): QuoteResource {
        return quoteMapper.mapModelToResource(getQuoteById.execute(id))
    }
}
