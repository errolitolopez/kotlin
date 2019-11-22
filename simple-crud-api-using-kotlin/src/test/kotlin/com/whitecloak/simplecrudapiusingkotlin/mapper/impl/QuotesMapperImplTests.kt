package com.whitecloak.simplecrudapiusingkotlin.mapper.impl

import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuotesEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.mapper.impl.QuotesMapperImpl
import com.whitecloak.simplecrudapiusingkotlin.quotes.domain.model.Quotes
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.MockitoAnnotations

class QuotesMapperImplTests {

    @Before
    fun init() {
        MockitoAnnotations.initMocks(this)
    }

//    val log = LoggerFactory.getLogger(SimpleCrudApiUsingKotlinApplication::class.java)

    @InjectMocks
    val quotesMapperImpl = QuotesMapperImpl()

    @Test
    fun map_whenQuotesIsGiven_thenCorrect() {
        val actual = Quotes()
        actual._id = "123"
        actual.author = "Errolito Lopez"
        actual.body = "It is a fantastic energy, sir."

        val expected = QuotesEntity()
        expected._id = "123"
        expected.author = "Errolito Lopez"
        expected.body = "It is a fantastic energy, sir."
        assertEquals(expected, quotesMapperImpl.map(actual))
    }

    @Test
    fun map_whenQuotesEntityIsGiven_thenCorrect() {
        val actual = QuotesEntity()
        actual._id = "123"
        actual.author = "Errolito Lopez"
        actual.body = "It is a fantastic energy, sir."

        val expected = Quotes()
        expected._id = "123"
        expected.author = "Errolito Lopez"
        expected.body = "It is a fantastic energy, sir."
        assertEquals(expected, quotesMapperImpl.map(actual))
    }
}
