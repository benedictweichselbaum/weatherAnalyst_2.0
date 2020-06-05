package weather.analyst.two.entity.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import weather.analyst.two.entity.WeatherDataObject

@Repository
interface WeatherDataObjectRepository : CrudRepository<WeatherDataObject, Long> {
}