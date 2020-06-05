package weather.analyst.two.entity

import lombok.Data
import org.springframework.data.jpa.repository.Temporal
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.TemporalType

@Entity
@Data
data class WeatherDataObject (@Id @GeneratedValue var id: Long,
                         var currentTemp: Double,
                         var minTemp: Double,
                         var maxTemp: Double,
                         var humidity: Int,
                         var weatherDesc: String,
                         var windSpeed: Double,
                         @Temporal(TemporalType.TIMESTAMP) var timeStamp: Date)