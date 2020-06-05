package weather.analyst.two.boundary

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import weather.analyst.two.controller.exception.OpenWeatherConnectionException

@ControllerAdvice
class CurrentWeatherExceptionHandler  {

    @ExceptionHandler(value = [(OpenWeatherConnectionException::class)])
    fun handleOpenWeatherException (exception: OpenWeatherConnectionException, request: WebRequest) {

    }
}