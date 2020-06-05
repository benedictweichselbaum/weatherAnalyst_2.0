package weather.analyst.two.controller.exception

class OpenWeatherConnectionException (override val message: String?) : RuntimeException(message)