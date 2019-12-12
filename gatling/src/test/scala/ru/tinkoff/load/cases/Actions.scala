package ru.tinkoff.load.cases

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

object Actions {

  val getMainPage: HttpRequestBuilder = http("Main_page")
    .get("/computers")
    .check(status is 200)
    .check(substring("Play sample application").exists)

  val filterByName: HttpRequestBuilder = http("Filter_by_name")
    .get("/computers")
    .queryParam("f", "new")
    .check(status is 500)

}
