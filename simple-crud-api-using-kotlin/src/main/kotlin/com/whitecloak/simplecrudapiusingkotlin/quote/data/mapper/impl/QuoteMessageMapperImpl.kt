package com.whitecloak.simplecrudapiusingkotlin.quote.data.mapper.impl

import com.whitecloak.simplecrudapiusingkotlin.quote.api.response.MessageResource
import com.whitecloak.simplecrudapiusingkotlin.quote.data.mapper.QuoteMessageMapper
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.DeleteQuote
import org.springframework.stereotype.Service

@Service
class QuoteMessageMapperImpl : QuoteMessageMapper {

    override fun mapDeleteQuoteToMessageResource(deleteQuote: DeleteQuote): MessageResource {
        return MessageResource(
                deleteQuote.message,
                deleteQuote.status
        )
    }
}