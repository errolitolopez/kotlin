package com.whitecloak.simplecrudapiusingkotlin.mapper.impl

import com.whitecloak.simplecrudapiusingkotlin.quotes.api.request.QuotesForm
import com.whitecloak.simplecrudapiusingkotlin.quotes.api.response.QuotesResource
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuotesEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.impl.QuotesMapperImpl
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quotes
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.MockitoAnnotations
import org.slf4j.LoggerFactory
import java.util.UUID

class QuotesMapperImplTests {

    @Before
    fun init() {
        MockitoAnnotations.initMocks(this)
    }

    private val log = LoggerFactory.getLogger(QuotesMapperImplTests::class.java)

    @InjectMocks
    val quotesMapperImpl = QuotesMapperImpl()

    @Test
    fun mapModelToEntity_whenQuotesIsGiven_thenCorrect() {
        val quotesId = UUID.randomUUID()

        val actual = Quotes()
        actual._id = quotesId
        actual.author = "Errolito Lopez"
        actual.body = "It is a fantastic energy, sir."

        val expected = QuotesEntity()
        expected._id = quotesId
        expected.author = "Errolito Lopez"
        expected.body = "It is a fantastic energy, sir."
        assertEquals(expected, quotesMapperImpl.mapModelToEntity(actual))
    }

    @Test
    fun mapEntityToModel_whenQuotesEntityIsGiven_thenCorrect() {
        val quotesId = UUID.randomUUID()

        val actual = QuotesEntity()
        actual._id = quotesId
        actual.author = "Errolito Lopez"
        actual.body = "It is a fantastic energy, sir."

        val expected = Quotes()
        expected._id = quotesId
        expected.author = "Errolito Lopez"
        expected.body = "It is a fantastic energy, sir."
        assertEquals(expected, quotesMapperImpl.mapEntityToModel(actual))
    }

    @Test
    fun mapFormToModel_whenQuotesFormIsGiven_thenCorrect() {
        val actual = QuotesForm()
        actual.author = "Errolito Lopez"
        actual.body = "It is a fantastic energy, sir."

        val expected = Quotes()
        expected.author = "Errolito Lopez"
        expected.body = "It is a fantastic energy, sir."
        assertEquals(expected, quotesMapperImpl.mapFormToModel(actual))
    }

    @Test
    fun mapModelToResource_whenQuotesIsGiven_thenCorrect() {
        val quotesId = UUID.randomUUID()

        val actual = Quotes()
        actual._id = quotesId
        actual.author = "Errolito Lopez"
        actual.body = "String"

        val expected = QuotesResource()
        expected.author = "Errolito Lopez"
        expected.body = "String"
        assertEquals(expected, quotesMapperImpl.mapModelToResource(actual))
    }
}
