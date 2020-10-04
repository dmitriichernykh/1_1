package ru.otus.sc.echo.service.impl

import ru.otus.sc.echo.model.{EchoRequest, EchoResponse}
import ru.otus.sc.echo.service.EchoService

class EchoServiceImpl extends EchoService {

  /** Returns the same value as it is in the input
    *
    * @param request  request with the input value
    * @return         response containing the input value
    */
  override def echo(request: EchoRequest): EchoResponse = EchoResponse(request.value)
}
