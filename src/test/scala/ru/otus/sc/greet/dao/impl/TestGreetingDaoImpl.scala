package ru.otus.sc.greet.dao.impl

import org.scalatest.freespec.AnyFreeSpec

class TestGreetingDaoImpl extends AnyFreeSpec {
  "GreetingDaoImpl" - {
    "should have prefix 'Hi'" in {
      val greetingDao = new GreetingDaoImpl
      assert(greetingDao.greetingPrefix === "Hi")
    }
    "should have postfix '!'" in {
      val greetingDao = new GreetingDaoImpl
      assert(greetingDao.greetingPostfix === "!")
    }
  }
}
