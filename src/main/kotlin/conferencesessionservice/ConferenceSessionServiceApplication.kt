package conferencesessionservice

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConferenceSessionServiceApplication

fun main(args: Array<String>) {
	runApplication<ConferenceSessionServiceApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
