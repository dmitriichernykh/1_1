package ru.otus.sc.counter.dao.impl

import ru.otus.sc.counter.dao.CounterDao

class CounterDaoImpl extends CounterDao {
  private var _storage = 0

  def counter: Int = _storage
  def counter_=(value: Int): Unit = {
    _storage = value
  }
}
