package ru.otus.sc.factorial.dao.impl

import ru.otus.sc.factorial.dao.Factorial2020Dao

import scala.math.BigInt

class Factorial2020DaoImpl extends Factorial2020Dao {
  private val k = 2020
  private lazy val factorial =
    (1 to k).foldLeft(BigInt(1))((acc, term) => acc * term).toString.toVector

  def nthDigit(n: Int): Char = if (0 < n && n <= factorial.length) factorial(n - 1) else '?'
}
