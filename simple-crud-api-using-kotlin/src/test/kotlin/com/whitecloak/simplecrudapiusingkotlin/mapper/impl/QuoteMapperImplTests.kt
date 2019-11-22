package com.whitecloak.simplecrudapiusingkotlin.mapper.impl

import com.whitecloak.simplecrudapiusingkotlin.quotes.api.request.QuoteForm
import com.whitecloak.simplecrudapiusingkotlin.quotes.api.response.QuoteResource
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuoteEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.impl.QuoteMapperImpl
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quote
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
    val quotesMapperImpl = QuoteMapperImpl()

    @Test
    fun mapModelToEntity_whenQuotesIsGiven_thenCorrect() {

        val actual = Quote()
        actual._id = "123"
        actual.author = "Errolito Lopez"
        actual.body = "It is a fantastic energy, sir."

        val expected = QuoteEntity()
        expected._id = "123"
        expected.author = "Errolito Lopez"
        expected.body = "It is a fantastic energy, sir."
        assertEquals(expected, quotesMapperImpl.mapModelToEntity(actual))
    }

    @Test
    fun mapEntityToModel_whenQuotesEntityIsGiven_thenCorrect() {

        val actual = QuoteEntity()
        actual._id = "123"
        actual.author = "Errolito Lopez"
        actual.body = "It is a fantastic energy, sir."

        val expected = Quote()
        expected._id = "123"
        expected.author = "Errolito Lopez"
        expected.body = "It is a fantastic energy, sir."
        assertEquals(expected, quotesMapperImpl.mapEntityToModel(actual))
    }

    @Test
    fun mapFormToModel_whenQuotesFormIsGiven_thenCorrect() {
        val actual = QuoteForm()
        actual.author = "Errolito Lopez"
        actual.body = "It is a fantastic energy, sir."

        val expected = Quote()
        expected.author = "Errolito Lopez"
        expected.body = "It is a fantastic energy, sir."
        assertEquals(expected, quotesMapperImpl.mapFormToModel(actual))
    }

    @Test
    fun mapModelToResource_whenQuotesIsGiven_thenCorrect() {

        val actual = Quote()
        actual._id = "123"
        actual.author = "Errolito Lopez"
        actual.body = "String"

        val expected = QuoteResource()
        expected.author = "Errolito Lopez"
        expected.body = "String"
        assertEquals(expected, quotesMapperImpl.mapModelToResource(actual))
    }
}
