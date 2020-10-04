package ru.otus.sc.fifa.service.impl

import org.scalatest.freespec.AnyFreeSpec
import ru.otus.sc.fifa.dao.impl.WorldChampionDaoImpl
import ru.otus.sc.fifa.model.WorldChampionRequest

class TestWorldChampionServiceImpl extends AnyFreeSpec {
  "WorldChampionService" - {
    "should return a positive integer for a world champion" in {
      val worldChampionServiceImpl = new WorldChampionServiceImpl(new WorldChampionDaoImpl)
      val result                   = worldChampionServiceImpl.totalWinCount(WorldChampionRequest("France"))
      assert(result.winsCount > 0)
    }
    "should return zero if a country did not win FIFA World Cup" in {
      val worldChampionServiceImpl = new WorldChampionServiceImpl(new WorldChampionDaoImpl)
      val result                   = worldChampionServiceImpl.totalWinCount(WorldChampionRequest("Russia"))
      assert(result.winsCount === 0)
    }
  }
}
