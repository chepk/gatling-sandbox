import sbt._

object Dependencies {
  lazy val gatling: Seq[ModuleID] = Seq(
    "io.gatling.highcharts" % "gatling-charts-highcharts",
    "io.gatling" % "gatling-test-framework"
  ).map(_ % "3.3.1" % Test)

  lazy val gelf:Seq[ModuleID] = Seq(
    "de.siegmar" % "logback-gelf"
  ).map(_ % "2.1.0")

}
