package com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model

data class Quote(
        var _id: String? = null,
        var body: String? = null,
        var author: String? = null
)