package com.whitecloak.simplecrudapiusingkotlin.quote.data.mapper.impl

import com.whitecloak.simplecrudapiusingkotlin.quote.api.request.QuoteForm
import com.whitecloak.simplecrudapiusingkotlin.quote.api.response.QuoteResource
import com.whitecloak.simplecrudapiusingkotlin.quote.data.entity.QuoteEntity
import com.whitecloak.simplecrudapiusingkotlin.quote.data.mapper.QuoteMapper
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote
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
