package ru.otus.sc.echo.service.impl

import org.scalatest.freespec.AnyFreeSpec
import ru.otus.sc.echo.model.{EchoRequest, EchoResponse}

class TestEchoServiceImpl extends AnyFreeSpec {
  "EchoServiceImpl" - {
    "should return an input value as an output" in {
      val echoServiceImpl = new EchoServiceImpl
      val input           = "hello"
      val actual          = echoServiceImpl.echo(EchoRequest(input))
      assert(EchoResponse(input) === actual)
    }
  }
}
