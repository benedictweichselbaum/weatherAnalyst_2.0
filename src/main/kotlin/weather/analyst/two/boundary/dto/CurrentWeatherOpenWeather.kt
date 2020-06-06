package weather.analyst.two.boundary.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import lombok.Data
import lombok.NoArgsConstructor

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
data class CurrentWeatherOpenWeather (
        var coord: Coordinates,
        var weather: List<WeatherDescription>,
        var base: String,
        var main: MainInformation,
        var visibility: Int,
        var wind: Wind,
        var clouds: Clouds,
        var dt: Long,
        var sys: AdditionalInformation,
        var timezone: Int,
        var id: Long,
        var name: String,
        var cod: Int
) {
    @Data
    @NoArgsConstructor
    class AdditionalInformation (
        var type: Int,
        var id: Int,
        var country: String,
        var sunrise: Long,
        var sunset: Long
    )

    @Data
    @NoArgsConstructor
    class Clouds (
        var all: Int
    )

    @Data
    @NoArgsConstructor
    class Coordinates (
        var lon: Double,
        var lat: Double
    )

    @Data
    @NoArgsConstructor
    class MainInformation (
            var temp: Double,
            var feelsLike: Double,
            var temp_min: Double,
            var temp_max: Double,
            var pressure: Int,
            var humidity: Int
    )

    @Data
    @NoArgsConstructor
    class WeatherDescription (
        var id: Int,

        // Main weather information like 'Clouds'
        var main: String,
        var description: String,
        var icon: String
    )

    @Data
    @NoArgsConstructor
    class Wind (
        var speed: Double,

        // Degree
        var deg: Int
    )
}