package com.whitecloak.simplecrudapiusingkotlin.quotes.api.controller

import com.whitecloak.simplecrudapiusingkotlin.quotes.api.request.QuotesForm
import com.whitecloak.simplecrudapiusingkotlin.quotes.api.response.QuotesResource
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.QuotesMapper
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.usecase.CreateQuotes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping(path = ["/api/quotes"])
class QuotesController @Autowired constructor(
        val quotesMapper: QuotesMapper,
        val createQuotes: CreateQuotes
) {

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    fun createQuotes(@Valid @RequestBody quotesForm: QuotesForm): QuotesResource {
        return createQuotes.execute(quotesMapper.mapFormToModel(quotesForm))
    }
}
