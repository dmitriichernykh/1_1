package ru.otus.sc.counter.service.impl

import ru.otus.sc.counter.dao.CounterDao
import ru.otus.sc.counter.model.{CounterRequest, CounterResponse}
import ru.otus.sc.counter.service.CounterService

class CounterServiceImpl(dao: CounterDao) extends CounterService {

  /** Counts how many times the method was called
    *
    * @param request request with no parameters
    * @return        number representing total count of the method calls
    */
  override def count(request: CounterRequest): CounterResponse = {
    val result = dao.counter + 1
    dao.counter = result
    CounterResponse(result)
  }
}
