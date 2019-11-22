package com.whitecloak.simplecrudapiusingkotlin.quotes.api.request

data class QuoteForm(
        var author: String? = null,
        var body: String? = null
)