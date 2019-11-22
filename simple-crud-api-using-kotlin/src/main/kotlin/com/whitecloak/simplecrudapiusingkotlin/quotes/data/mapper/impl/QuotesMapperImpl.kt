package com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.impl

import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuotesEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.QuotesMapper
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quotes
import org.springframework.stereotype.Component

@Component
class QuotesMapperImpl : QuotesMapper {
    override fun map(quotes: Quotes): QuotesEntity {
        return QuotesEntity(
                quotes._id,
                quotes.body,
                quotes.author
        )
    }

    override fun map(quotesEntity: QuotesEntity): Quotes {
        return Quotes(
                quotesEntity._id,
                quotesEntity.body,
                quotesEntity.author
        )
    }
}
