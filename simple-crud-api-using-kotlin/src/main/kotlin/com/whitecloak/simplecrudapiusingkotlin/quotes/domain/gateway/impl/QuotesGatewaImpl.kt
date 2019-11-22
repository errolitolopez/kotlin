package com.whitecloak.simplecrudapiusingkotlin.quotes.domain.gateway.impl

import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuoteEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.QuoteMapper
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.repository.QuoteRepository
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.gateway.QuoteGateway
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quote
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class QuoteGatewayImpl @Autowired constructor(
        val quoteMapper: QuoteMapper,
        val quoteRepository: QuoteRepository
) : QuoteGateway {

    override fun createOne(quoteEntity: QuoteEntity): Quote {
        return quoteMapper.mapEntityToModel(quoteRepository.save(quoteEntity))
    }

    override fun getOneById(id: String): Quote {
        return quoteMapper.mapEntityToModel(quoteRepository.findById(id))
    }
}
