package com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.impl

import com.whitecloak.simplecrudapiusingkotlin.quotes.api.request.QuotesForm
import com.whitecloak.simplecrudapiusingkotlin.quotes.api.response.QuotesResource
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuotesEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.QuotesMapper
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quotes
import org.springframework.stereotype.Component

@Component
class QuotesMapperImpl : QuotesMapper {
    override fun mapModelToEntity(quotes: Quotes): QuotesEntity {
        return QuotesEntity(
                quotes._id,
                quotes.body,
                quotes.author
        )
    }

    override fun mapEntityToModel(quotesEntity: QuotesEntity): Quotes {
        return Quotes(
                quotesEntity._id,
                quotesEntity.body,
                quotesEntity.author
        )
    }

    override fun mapFormToModel(quotesForm: QuotesForm): Quotes {
        return Quotes(
                null,
                quotesForm.body,
                quotesForm.author
        )
    }

    override fun mapModelToResource(quotes: Quotes): QuotesResource {
        return QuotesResource(
                quotes.body,
                quotes.author
        )
    }
}
