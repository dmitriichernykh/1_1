package ru.otus.sc.factorial.service.impl

import org.scalatest.freespec.AnyFreeSpec
import ru.otus.sc.factorial.dao.impl.Factorial2020DaoImpl
import ru.otus.sc.factorial.model.{Factorial2020Request, Factorial2020Response}

class TestFactorial2020ServiceImpl extends AnyFreeSpec {
  "2020!" - {
    val service = new Factorial2020ServiceImpl(new Factorial2020DaoImpl)
    "should have digit 0 in the last position" in {
      val result = service.nthDigit(Factorial2020Request(5802))
      assert(result === Factorial2020Response('0'))
    }
    "should return '?' for negative position" in {
      val result = service.nthDigit(Factorial2020Request(-5))
      assert(result === Factorial2020Response('?'))
    }
  }
}
