package weather.analyst.two.entity

import org.springframework.data.jpa.repository.Temporal
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "weather_data_object", schema = "weatherDB")
data class WeatherDataObject (@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
                         var currentTemp: Double,
                         var minTemp: Double,
                         var maxTemp: Double,
                         var humidity: Int,
                         var weatherDesc: String,
                         var windSpeed: Double,
                         @Temporal(TemporalType.TIMESTAMP) var timeStamp: Date)