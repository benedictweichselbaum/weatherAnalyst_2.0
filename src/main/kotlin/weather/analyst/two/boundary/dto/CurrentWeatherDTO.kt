package weather.analyst.two.boundary.dto

import lombok.NoArgsConstructor

@NoArgsConstructor
data class CurrentWeatherDTO (
        var id: Long,
        var currentTemp: Double,
        var minTemp: Double,
        var maxTemp: Double,
        var humidity: Int,
        var weatherDescription: String,
        var windSpeed: Double
)