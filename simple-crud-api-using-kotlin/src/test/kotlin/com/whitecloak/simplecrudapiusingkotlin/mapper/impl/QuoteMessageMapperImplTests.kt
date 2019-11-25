package com.whitecloak.simplecrudapiusingkotlin.mapper.impl

import com.whitecloak.simplecrudapiusingkotlin.quote.api.response.MessageResource
import com.whitecloak.simplecrudapiusingkotlin.quote.constant.QuoteMessageConstant
import com.whitecloak.simplecrudapiusingkotlin.quote.data.mapper.impl.QuoteMessageMapperImpl
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.DeleteQuote
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.MockitoAnnotations
import org.slf4j.LoggerFactory

class QuoteMessageMapperImplTests {

    @Before
    fun init() {
        MockitoAnnotations.initMocks(this)
    }

    private val log = LoggerFactory.getLogger(QuoteMessageMapperImplTests::class.java)

    @InjectMocks
    val quoteMessageMapperImpl = QuoteMessageMapperImpl()

    @Test
    fun mapDeleteQuoteToMessageResource_whenDeleteQuoteIsGiven_thenCorrect() {
        val actual = DeleteQuote()
        actual.message = QuoteMessageConstant.DELETED.message
        actual.status = QuoteMessageConstant.DELETED.status

        val expected = MessageResource()
        expected.message = QuoteMessageConstant.DELETED.message
        expected.status = QuoteMessageConstant.DELETED.status

        assertEquals(expected, quoteMessageMapperImpl.mapDeleteQuoteToMessageResource(actual))
    }
}