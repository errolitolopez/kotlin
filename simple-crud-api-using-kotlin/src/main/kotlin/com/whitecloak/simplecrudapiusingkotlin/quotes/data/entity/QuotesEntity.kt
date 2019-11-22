package com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("Quotes")
data class QuotesEntity(
        @Id
        var _id: String? = null,
        var body: String? = null,
        var author: String? = null
)
