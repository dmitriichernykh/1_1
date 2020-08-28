package ru.otus.sc.greet.service.impl

import org.scalatest.freespec.AnyFreeSpec
import ru.otus.sc.greet.dao.impl.GreetingDaoImpl
import ru.otus.sc.greet.model.{GreetRequest, GreetResponse}

class TestGreetingServiceImpl extends AnyFreeSpec {
  "GreetingServiceImpl" - {
    "when a request" - {
      "is not from a human should scream" in {
        val greetingServiceImpl = new GreetingServiceImpl(new GreetingDaoImpl)
        val expected            = GreetResponse("AAAAAAAAAA!!!!!!")
        val actual              = greetingServiceImpl.greet(GreetRequest("Legolas", isHuman = false))
        assert(expected === actual)
      }

      "is a human should greet the human" in {
        val greetingServiceImpl = new GreetingServiceImpl(new GreetingDaoImpl)
        val humanName           = "Aragorn"
        val actual              = greetingServiceImpl.greet(GreetRequest(humanName))
        assert(actual.greeting contains humanName)
      }
    }
  }
}
