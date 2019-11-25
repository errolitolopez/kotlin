package com.whitecloak.simplecrudapiusingkotlin.quote.api.controller

import com.whitecloak.simplecrudapiusingkotlin.quote.api.request.QuoteForm
import com.whitecloak.simplecrudapiusingkotlin.quote.api.response.MessageResource
import com.whitecloak.simplecrudapiusingkotlin.quote.api.response.QuoteResource
import com.whitecloak.simplecrudapiusingkotlin.quote.data.mapper.QuoteMapper
import com.whitecloak.simplecrudapiusingkotlin.quote.data.mapper.QuoteMessageMapper
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.PageableModel
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.CreateQuote
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.DeleteQuoteById
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.FetchPaginatedQuotes
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.FetchQuotesByAuthor
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.FindQuoteById
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.usecase.UpdateQuoteById
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping(path = ["/api/quote"])
class QuoteController @Autowired constructor(
        val quoteMapper: QuoteMapper,
        val createQuote: CreateQuote,
        val findQuoteById: FindQuoteById,
        val fetchQuotesByAuthor: FetchQuotesByAuthor,
        val updateQuoteById: UpdateQuoteById,
        val deleteQuoteById: DeleteQuoteById,
        val quoteMessageMapper: QuoteMessageMapper,
        val fetchPaginatedQuotes: FetchPaginatedQuotes
) {

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    fun createQuote(@Valid @RequestBody quoteForm: QuoteForm): QuoteResource {
        val createdQuote = createQuote.execute(quoteMapper.mapFormToModel(quoteForm))
        return quoteMapper.mapModelToResource(createdQuote)
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun fetchQuoteById(@Valid @PathVariable id: String): QuoteResource {
        return quoteMapper.mapModelToResource(findQuoteById.execute(id))
    }

    @GetMapping("/{author}/all")
    @ResponseStatus(HttpStatus.OK)
    fun fetchQuotesByAuthor(@Valid @PathVariable author: String): List<QuoteResource> {
        return fetchQuotesByAuthor.execute(author).map(quoteMapper::mapModelToResource)
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    fun fetchPaginatedQuotes(@RequestParam(required = true, value = "page_num", defaultValue = "1") pageNum: Int,
                             @RequestParam(required = true, value = "limit", defaultValue = "10") limit: Int,
                             @RequestParam(required = false, value = "sort", defaultValue = "POPULARITY") sort: String
    ): PageableModel<Quote> {

        return fetchPaginatedQuotes.execute(sort, pageNum, limit)
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun updateQuoteById(@Valid @RequestBody quoteForm: QuoteForm, @PathVariable id: String): QuoteResource {
        val updatedQuote = updateQuoteById.execute(id, quoteMapper.mapFormToModel(quoteForm))
        return quoteMapper.mapModelToResource(updatedQuote)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun deleteQuoteById(@Valid @PathVariable id: String): MessageResource {
        val deletedQuote = deleteQuoteById.execute(id)
        return quoteMessageMapper.mapDeleteQuoteToMessageResource(deletedQuote)
    }
}
