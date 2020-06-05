package weather.analyst.two.controller.service

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import weather.analyst.two.boundary.dto.CurrentWeatherOpenWeather
import weather.analyst.two.controller.exception.OpenWeatherConnectionException

@Service
class WeatherInformationService {

    private val OPEN_WEATHER_CURRENT_WEATHER_URL: String = "http://api.openweathermap.org/data/2.5/weather?q=Feucht,de&appid=77fcc806d69a8e8b04a114415ed9885e"
    private val OPEN_WEATHER_ERROR_MESSAGE: String = "Object from Open Weather is null"

    fun getWeatherInformation () : CurrentWeatherOpenWeather {
        val currentWeatherOpenWeather: CurrentWeatherOpenWeather? =
                RestTemplate().getForObject(OPEN_WEATHER_CURRENT_WEATHER_URL, CurrentWeatherOpenWeather::class.java)
        if (currentWeatherOpenWeather != null) return currentWeatherOpenWeather.copy()
        else throw OpenWeatherConnectionException(OPEN_WEATHER_ERROR_MESSAGE)
    }
}