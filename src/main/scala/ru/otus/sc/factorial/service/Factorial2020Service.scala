package ru.otus.sc.factorial.service

import ru.otus.sc.factorial.model.{Factorial2020Request, Factorial2020Response}

trait Factorial2020Service {
  def nthDigit(request: Factorial2020Request): Factorial2020Response
}
