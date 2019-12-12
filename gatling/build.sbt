import Dependencies._

enablePlugins(GatlingPlugin)

lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := "ru.tinkoff.load",
      scalaVersion := "2.12.9",
      version := "0.1"
    )),
    name := "gatling-template-project",
    libraryDependencies ++= gatling,
    libraryDependencies ++= gelf,
    scalacOptions ++= Seq(
      "-encoding", "UTF-8",
      "-Xfatal-warnings",
      "-deprecation",
      "-feature",
      "-unchecked",
      "-language:implicitConversions",
      "-language:higherKinds",
      "-language:existentials",
      "-language:postfixOps"
    )
  )
