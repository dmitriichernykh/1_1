package ru.otus.sc.greet.service.impl

import ru.otus.sc.greet.dao.GreetingDao
import ru.otus.sc.greet.model.{GreetRequest, GreetResponse}
import ru.otus.sc.greet.service.GreetingService

class GreetingServiceImpl(dao: GreetingDao) extends GreetingService {

  /** Greets a human by name with prefix and postfix added. Screams if a request is not from a human.
    *
    * @param request  name and an indication of a human
    * @return         a greeting or a scream
    */
  def greet(request: GreetRequest): GreetResponse =
    if (request.isHuman)
      GreetResponse(s"${dao.greetingPrefix} ${request.name} ${dao.greetingPostfix}")
    else GreetResponse("AAAAAAAAAA!!!!!!")
}
