package weather.analyst.two.boundary

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import weather.analyst.two.boundary.dto.CurrentWeatherDTO
import weather.analyst.two.controller.GetCurrentWeatherAggregator

@RestController
@RequestMapping("/weather")
class WeatherController (
        private val getCurrentWeatherAggregator: GetCurrentWeatherAggregator
) {
    @GetMapping("/current_weather")
    fun getCurrentWeatherInformation () : ResponseEntity<CurrentWeatherDTO> =
            ResponseEntity.ok().body(this.getCurrentWeatherAggregator.processGetCurrentWeatherRequest())
}