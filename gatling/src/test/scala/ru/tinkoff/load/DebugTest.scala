package ru.tinkoff.load

import io.gatling.core.Predef._
import ru.tinkoff.load.scenarios.BasicSimulation
import scala.concurrent.duration._

class DebugTest extends Simulation {

  setUp(
    BasicSimulation.scn.inject(atOnceUsers(1))
  ).protocols(httpProtocol)
    .maxDuration(stageDuration seconds)

}
