package com.whitecloak.simplecrudapiusingkotlin.quotes.data.repository

import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuotesEntity

interface QuotesRepository {

    fun save(quotesEntity: QuotesEntity) : QuotesEntity
}