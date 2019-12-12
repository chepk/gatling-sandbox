package ru.tinkoff.load.scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import ru.tinkoff.load.cases.Actions

object BasicSimulation {

  val scn: ScenarioBuilder = scenario("Basic")
    .exec(Actions.getMainPage)
    .exec(Actions.filterByName)

}
