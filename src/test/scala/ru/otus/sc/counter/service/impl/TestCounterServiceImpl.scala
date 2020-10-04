package ru.otus.sc.counter.service.impl

import org.scalatest.freespec.AnyFreeSpec
import ru.otus.sc.counter.dao.impl.CounterDaoImpl
import ru.otus.sc.counter.model.{CounterRequest, CounterResponse}

class TestCounterServiceImpl extends AnyFreeSpec {
  "CounterServiceImpl" - {
    "should increment a counter" in {
      val counterServiceImpl = new CounterServiceImpl(new CounterDaoImpl)
      val counter            = counterServiceImpl.count(CounterRequest()).value
      val actual             = counterServiceImpl.count(CounterRequest())
      val expected           = CounterResponse(1 + counter)
      assert(expected === actual)
    }
  }
}
