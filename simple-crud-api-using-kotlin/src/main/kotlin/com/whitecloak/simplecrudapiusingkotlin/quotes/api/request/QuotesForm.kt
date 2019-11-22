package com.whitecloak.simplecrudapiusingkotlin.quotes.api.request

data class QuotesForm(
        var author: String? = null,
        var body: String? = null
)