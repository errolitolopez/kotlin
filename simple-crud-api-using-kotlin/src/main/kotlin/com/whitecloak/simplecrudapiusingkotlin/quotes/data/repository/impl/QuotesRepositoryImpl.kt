package com.whitecloak.simplecrudapiusingkotlin.quotes.data.repository.impl

import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuotesEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.repository.QuotesRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class QuotesRepositoryImpl : QuotesRepository {

    private val log = LoggerFactory.getLogger(QuotesRepositoryImpl::class.java)

    override fun save(quotesEntity: QuotesEntity): QuotesEntity {

        log.info("quotesEntity {}", quotesEntity)
        return quotesEntity
    }
}