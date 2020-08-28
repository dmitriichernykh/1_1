package ru.otus.sc.fifa.service

import ru.otus.sc.fifa.model.{WorldChampionRequest, WorldChampionResponse}

trait WorldChampionService {
  def totalWinCount(request: WorldChampionRequest): WorldChampionResponse
}
