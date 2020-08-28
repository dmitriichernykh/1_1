package ru.otus.sc.factorial.service.impl

import ru.otus.sc.factorial.dao.impl.Factorial2020DaoImpl
import ru.otus.sc.factorial.model.{Factorial2020Request, Factorial2020Response}
import ru.otus.sc.factorial.service.Factorial2020Service

class Factorial2020ServiceImpl(dao: Factorial2020DaoImpl) extends Factorial2020Service {

  /** Returns n-th digit of number 2020!
    *
    * @param request   request with the position number
    * @return          the requested digit of 2020! or ? if the requested position is incorrect
    */
  def nthDigit(request: Factorial2020Request): Factorial2020Response = {
    Factorial2020Response(dao.nthDigit(request.position))
  }
}
