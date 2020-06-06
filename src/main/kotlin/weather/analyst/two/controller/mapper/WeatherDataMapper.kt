package weather.analyst.two.controller.mapper

import weather.analyst.two.boundary.dto.CurrentWeatherDTO
import weather.analyst.two.boundary.dto.CurrentWeatherOpenWeather
import weather.analyst.two.entity.WeatherDataObject
import java.util.*

class WeatherDataMapper {
    companion object {
        fun mapOpenObjectToEntity(openWeatherObject: CurrentWeatherOpenWeather): WeatherDataObject =
                WeatherDataObject(
                        currentTemp = openWeatherObject.main.temp,
                        minTemp = openWeatherObject.main.temp_min,
                        maxTemp = openWeatherObject.main.temp_max,
                        humidity = openWeatherObject.main.humidity,
                        weatherDesc = openWeatherObject.weather[0].description,
                        windSpeed = openWeatherObject.wind.speed,
                        timeStamp = Calendar.getInstance().time
                )

        fun mapOpenObjectToDTO(openWeatherObject: CurrentWeatherOpenWeather, id: Long): CurrentWeatherDTO =
                CurrentWeatherDTO(
                        id,
                        openWeatherObject.main.temp,
                        openWeatherObject.main.temp_min,
                        openWeatherObject.main.temp_max,
                        openWeatherObject.main.humidity,
                        openWeatherObject.weather[0].description,
                        openWeatherObject.wind.speed
                )
    }
}