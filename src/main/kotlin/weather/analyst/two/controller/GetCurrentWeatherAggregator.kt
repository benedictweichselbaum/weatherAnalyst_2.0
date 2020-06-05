package weather.analyst.two.controller

import org.springframework.stereotype.Service
import weather.analyst.two.boundary.dto.CurrentWeatherDTO
import weather.analyst.two.boundary.dto.CurrentWeatherOpenWeather
import weather.analyst.two.controller.mapper.WeatherDataMapper
import weather.analyst.two.controller.service.WeatherInformationService
import weather.analyst.two.entity.repository.WeatherDataObjectRepository

@Service
class GetCurrentWeatherAggregator (
        private val weatherInformationService: WeatherInformationService,
        private val weatherDataObjectRepository: WeatherDataObjectRepository
) {
    fun processGetCurrentWeatherRequest () : CurrentWeatherDTO {
        val currentWeatherOpenWeather: CurrentWeatherOpenWeather =
                this.weatherInformationService.getWeatherInformation()
        this.weatherDataObjectRepository.save(WeatherDataMapper.mapOpenObjectToEntity(currentWeatherOpenWeather))
        return WeatherDataMapper.mapOpenObjectToDTO(currentWeatherOpenWeather)
    }
}