package ru.otus.sc.fifa.service.impl

import ru.otus.sc.fifa.dao.WorldChampionDao
import ru.otus.sc.fifa.model.{WorldChampionRequest, WorldChampionResponse}
import ru.otus.sc.fifa.service.WorldChampionService

class WorldChampionServiceImpl(dao: WorldChampionDao) extends WorldChampionService {

  /** Answers how many times a country won FIFA World Cup
    *
    * @param request   request with a country name
    * @return          response with a total wins count
    */
  def totalWinCount(request: WorldChampionRequest): WorldChampionResponse = {
    WorldChampionResponse(dao.winCount(request.country))
  }
}
