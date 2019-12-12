package ru.tinkoff

import java.util.concurrent.TimeUnit

import com.typesafe.config.ConfigFactory
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

package object load {

  val conf = configuration.config.withFallback(ConfigFactory.load("simulation.conf")).resolve()

  lazy val baseUrl: String     = conf.getString("baseUrl")
  lazy val rampDuration: Long  = conf.getLong("rampDuration")
  lazy val stageDuration: Long = conf.getLong("stageDuration")
  lazy val testDuration: Long  = rampDuration + stageDuration
  lazy val rps: Double         = conf.getDouble("rps")

  val httpProtocol: HttpProtocolBuilder = http
    .baseUrl(baseUrl)
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")
    .disableFollowRedirect

}
