package com.whitecloak.simplecrudapiusingkotlin.quote.api.request

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class QuoteForm(
        @get: NotNull
        @get: NotEmpty
        @get: Size(min = 2, max = 255)
        var author: String?,

        @get: NotNull
        @get: NotEmpty
        @get: Size(min = 2, max = 255)
        var body: String?
)
