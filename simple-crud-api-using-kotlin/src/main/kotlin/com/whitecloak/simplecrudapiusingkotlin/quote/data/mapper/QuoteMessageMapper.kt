package com.whitecloak.simplecrudapiusingkotlin.quote.data.mapper

import com.whitecloak.simplecrudapiusingkotlin.quote.api.response.MessageResource
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.DeleteQuote

interface QuoteMessageMapper {

    fun mapDeleteQuoteToMessageResource(deleteQuote: DeleteQuote): MessageResource
}