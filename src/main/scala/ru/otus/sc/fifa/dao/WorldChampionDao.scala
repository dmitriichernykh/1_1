package ru.otus.sc.fifa.dao

trait WorldChampionDao {
  def winCount(year: String): Int
}
