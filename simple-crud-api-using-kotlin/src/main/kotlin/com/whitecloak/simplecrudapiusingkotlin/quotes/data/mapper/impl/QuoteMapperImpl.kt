package com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.impl

import com.whitecloak.simplecrudapiusingkotlin.quotes.api.request.QuoteForm
import com.whitecloak.simplecrudapiusingkotlin.quotes.api.response.QuoteResource
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuoteEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.QuoteMapper
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quote
import org.springframework.stereotype.Component

@Component
class QuoteMapperImpl : QuoteMapper {
    override fun mapModelToEntity(quote: Quote): QuoteEntity {
        return QuoteEntity(
                quote._id,
                quote.body,
                quote.author
        )
    }

    override fun mapEntityToModel(quoteEntity: QuoteEntity): Quote {
        return Quote(
                quoteEntity._id,
                quoteEntity.body,
                quoteEntity.author
        )
    }

    override fun mapFormToModel(quoteForm: QuoteForm): Quote {
        return Quote(
                null,
                quoteForm.body,
                quoteForm.author
        )
    }

    override fun mapModelToResource(quote: Quote): QuoteResource {
        return QuoteResource(
                quote.body,
                quote.author
        )
    }
}
