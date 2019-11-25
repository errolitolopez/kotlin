package com.whitecloak.simplecrudapiusingkotlin.quote.domain.gateway.impl

import com.whitecloak.simplecrudapiusingkotlin.quote.constant.QuoteMessageConstant
import com.whitecloak.simplecrudapiusingkotlin.quote.data.entity.QuoteEntity
import com.whitecloak.simplecrudapiusingkotlin.quote.data.mapper.QuoteMapper
import com.whitecloak.simplecrudapiusingkotlin.quote.data.repository.QuoteRepository
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.gateway.QuoteGateway
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.DeleteQuote
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote
import com.whitecloak.simplecrudapiusingkotlin.quote.exception.NotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class QuoteGatewayImpl @Autowired constructor(
        val quoteMapper: QuoteMapper,
        val quoteRepository: QuoteRepository
) : QuoteGateway {

    override fun createOne(quoteEntity: QuoteEntity): Quote {
        return quoteMapper.mapEntityToModel(quoteRepository.save(quoteEntity))
    }

    override fun findOneById(id: String): Quote {
        val quote = quoteRepository
                .findById(id)
                .orElseThrow { NotFoundException("Quote not existing.") }

        return quoteMapper.mapEntityToModel(quote)
    }

    override fun deleteOneById(id: String): DeleteQuote {
        val quote = quoteRepository
                .findById(id)
                .orElseThrow { NotFoundException("Quote not existing.") }

        quoteRepository.delete(quote)

        return DeleteQuote(
                QuoteMessageConstant.DELETED.message,
                QuoteMessageConstant.DELETED.status
        )
    }

    override fun findAllByAuthor(author: String): List<Quote> {
        val quotes = quoteRepository
                .findAllByAuthor(author)
                .map(quoteMapper::mapEntityToModel)

        if (quotes.isEmpty()) {
            throw NotFoundException("Quote not existing.")
        }

        return quotes
    }

    override fun fetchPageableQuotes(page: Pageable): Page<Quote> {

        return quoteRepository.findAll(page)
                .map(quoteMapper::mapEntityToModel)
    }
}
