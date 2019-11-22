package com.whitecloak.simplecrudapiusingkotlin.quotes.domain.gateway.impl

import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuotesEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.QuotesMapper
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.repository.QuotesRepository
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.gateway.QuotesGateway
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quotes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class QuotesGatewayImpl @Autowired constructor(
        val quotesMapper: QuotesMapper,
        val quotesRepository: QuotesRepository
) : QuotesGateway {

    override fun createOne(quotesEntity: QuotesEntity): Quotes {
        return quotesMapper.mapEntityToModel(quotesRepository.save(quotesEntity))
    }
}