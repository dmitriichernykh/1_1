package ru.otus.sc.caesar.service.impl

import org.scalatest.freespec.AnyFreeSpec
import ru.otus.sc.caesar.model.{CipherRequest, DecipherRequest}

class TestCaesarCipherImpl extends AnyFreeSpec {
  "round trip should get equivalent input and output" in {
    val service = new CaesarCipherImpl
    val input   = "Hello World!"
    assert(
      service.decipher(DecipherRequest(service.cipher(CipherRequest(input)).text)).text === input
    )
  }
}
