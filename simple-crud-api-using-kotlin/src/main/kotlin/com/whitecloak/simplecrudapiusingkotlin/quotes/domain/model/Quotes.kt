package com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model

import java.util.UUID

data class Quotes(
        var _id: UUID? = null,
        var body: String? = null,
        var author: String? = null
)
