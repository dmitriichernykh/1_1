package ru.otus.sc.fifa.dao.impl

import ru.otus.sc.fifa.dao.WorldChampionDao

class WorldChampionDaoImpl extends WorldChampionDao {
  def winCount(country: String): Int = {
    if (country == "Brazil") 5
    else if (country == "Germany" || country == "Italy") 4
    else if (country == "Argentina" || country == "France" || country == "Uruguay") 2
    else if (country == "England" || country == "Spain") 1
    else 0
  }
}
