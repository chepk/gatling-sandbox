package ru.tinkoff.load

import io.gatling.core.Predef._
import ru.tinkoff.load.scenarios.BasicSimulation
import scala.concurrent.duration._

class StabilityTest extends Simulation {

  setUp(
    BasicSimulation.scn.inject(
      rampUsersPerSec(0) to rps during (rampDuration seconds),
      constantUsersPerSec(rps) during (stageDuration seconds)
    )
  ).protocols(httpProtocol)
    .maxDuration(testDuration seconds)

}
