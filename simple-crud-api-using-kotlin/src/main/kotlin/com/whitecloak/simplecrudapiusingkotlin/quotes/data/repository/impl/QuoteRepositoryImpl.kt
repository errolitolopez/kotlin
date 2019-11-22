package com.whitecloak.simplecrudapiusingkotlin.quotes.data.repository.impl

import com.whitecloak.simplecrudapiusingkotlin.quotes.data.entity.QuoteEntity
import com.whitecloak.simplecrudapiusingkotlin.quotes.data.repository.QuoteRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class QuoteRepositoryImpl : QuoteRepository {

    private val log = LoggerFactory.getLogger(QuoteRepositoryImpl::class.java)

    override fun save(quoteEntity: QuoteEntity): QuoteEntity {

        log.info("quoteEntity {}", quoteEntity)
        return quoteEntity
    }

    override fun findById(id: String): QuoteEntity {

        val quotes: MutableList<QuoteEntity> = mutableListOf<QuoteEntity>()
        quotes.add(QuoteEntity("1000", "vulputate, lacus. Cras interdum. Nunc", "Kimberly Q. Oliver"))
        quotes.add(QuoteEntity("1001", "tempus eu, ligula. Aenean euismod", "Bertha K. Keith"))
        quotes.add(QuoteEntity("1002", "dapibus quam quis diam. Pellentesque", "Roth A. Wolfe"))
        quotes.add(QuoteEntity("1003", "porttitor scelerisque neque. Nullam nisl.", "Autumn E. Holder"))
        quotes.add(QuoteEntity("1004", "velit eu sem. Pellentesque ut", "Fiona E. Sykes"))
        quotes.add(QuoteEntity("1005", "Nullam enim. Sed nulla ante,", "Madison J. Manning"))
        quotes.add(QuoteEntity("1006", "in felis. Nulla tempor augue", "Caesar B. Sutton"))
        quotes.add(QuoteEntity("1007", "urna. Nullam lobortis quam a", "Jin X. Thomas"))
        quotes.add(QuoteEntity("1008", "eu eros. Nam consequat dolor", "Hiram T. Carroll"))
        quotes.add(QuoteEntity("1009", "fermentum arcu. Vestibulum ante ipsum", "Macy V. Petty"))
        quotes.add(QuoteEntity("1010", "Vivamus rhoncus. Donec est. Nunc", "Natalie Y. Gomez"))
        quotes.add(QuoteEntity("1011", "porttitor eros nec tellus. Nunc", "Xanthus U. Terry"))
        quotes.add(QuoteEntity("1012", "velit. Pellentesque ultricies dignissim lacus.", "Rana F. Coffey"))
        quotes.add(QuoteEntity("1013", "luctus, ipsum leo elementum sem,", "Jerry A. Jefferson"))
        quotes.add(QuoteEntity("1014", "tempor augue ac ipsum. Phasellus", "Honorato R. Booth"))
        quotes.add(QuoteEntity("1015", "orci. Donec nibh. Quisque nonummy", "Theodore G. Bowen"))
        quotes.add(QuoteEntity("1016", "posuere cubilia Curae; Donec tincidunt.", "Maris J. Brennan"))
        quotes.add(QuoteEntity("1017", "dictum placerat, augue. Sed molestie.", "Addison O. Donaldson"))
        quotes.add(QuoteEntity("1018", "nec tempus mauris erat eget", "Kennedy Y. Schneider"))

        return quotes.stream()
                .filter { q -> q._id.equals(id) }
                .collect(Collectors.toList())
                .first()
    }
}