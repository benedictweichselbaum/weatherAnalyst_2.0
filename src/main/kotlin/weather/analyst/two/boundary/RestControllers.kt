package weather.analyst.two.boundary

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import weather.analyst.two.controller.WeatherInformationService
import java.net.URI

@RestController
@RequestMapping("/weather")
class WeatherController (
        val weatherInformationService: WeatherInformationService
) {

    @GetMapping("/test")
    fun getTest () = "Hallo"

    // TODO: Implement
    @GetMapping("/current_weather")
    fun getCurrentWeatherInformation () : ResponseEntity<Void> = ResponseEntity.ok().build()
}