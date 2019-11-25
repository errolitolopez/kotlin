package com.whitecloak.simplecrudapiusingkotlin.mapper.impl

import com.whitecloak.simplecrudapiusingkotlin.quote.api.request.QuoteForm
import com.whitecloak.simplecrudapiusingkotlin.quote.api.response.QuoteResource
import com.whitecloak.simplecrudapiusingkotlin.quote.data.entity.QuoteEntity
import com.whitecloak.simplecrudapiusingkotlin.quote.data.mapper.impl.QuoteMapperImpl
import com.whitecloak.simplecrudapiusingkotlin.quote.domain.model.Quote
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.MockitoAnnotations
import org.slf4j.LoggerFactory

class QuoteMapperImplTests {

    @Before
    fun init() {
        MockitoAnnotations.initMocks(this)
    }

    private val log = LoggerFactory.getLogger(QuoteMapperImplTests::class.java)

    @InjectMocks
    val quoteMapperImpl = QuoteMapperImpl()

    @Test
    fun mapModelToEntity_whenQuoteIsGiven_thenCorrect() {
        val actual = Quote()
        actual._id = "123"
        actual.author = "Errolito Lopez"
        actual.body = "It is a fantastic energy, sir."

        val expected = QuoteEntity()
        expected._id = "123"
        expected.author = "Errolito Lopez"
        expected.body = "It is a fantastic energy, sir."
        assertEquals(expected, quoteMapperImpl.mapModelToEntity(actual))
    }

    @Test
    fun mapEntityToModel_whenQuoteEntityIsGiven_thenCorrect() {
        val actual = QuoteEntity()
        actual._id = "123"
        actual.author = "Errolito Lopez"
        actual.body = "It is a fantastic energy, sir."

        val expected = Quote()
        expected._id = "123"
        expected.author = "Errolito Lopez"
        expected.body = "It is a fantastic energy, sir."
        assertEquals(expected, quoteMapperImpl.mapEntityToModel(actual))
    }

    @Test
    fun mapFormToModel_whenQuoteFormIsGiven_thenCorrect() {
        val actual = QuoteForm(
                "Errolito Lopez",
                "It is a fantastic energy, sir."
        )

        val expected = Quote()
        expected.author = "Errolito Lopez"
        expected.body = "It is a fantastic energy, sir."
        assertEquals(expected, quoteMapperImpl.mapFormToModel(actual))
    }

    @Test
    fun mapModelToResource_whenQuoteIsGiven_thenCorrect() {
        val actual = Quote()
        actual._id = "123"
        actual.author = "Errolito Lopez"
        actual.body = "String"

        val expected = QuoteResource()
        expected.author = "Errolito Lopez"
        expected.body = "String"
        assertEquals(expected, quoteMapperImpl.mapModelToResource(actual))
    }
}
