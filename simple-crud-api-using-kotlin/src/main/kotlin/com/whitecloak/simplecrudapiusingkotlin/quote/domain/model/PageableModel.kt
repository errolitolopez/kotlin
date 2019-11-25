package com.whitecloak.simplecrudapiusingkotlin.quote.domain.model

data class PageableModel<T>(
        val data: List<T>,
        val page: Int,
        val limit: Int,
        val totalPages: Int,
        val totalCount: Int
)