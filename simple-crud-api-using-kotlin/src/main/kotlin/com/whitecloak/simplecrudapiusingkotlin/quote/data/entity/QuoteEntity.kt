package com.whitecloak.simplecrudapiusingkotlin.quote.data.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("Quote")
data class QuoteEntity(
        @Id
        var _id: String? = null,
        var body: String? = null,
        var author: String? = null
)
