# gatling-sandbox

`git clone http://ci.tinkoff.cloud/loadtesting/dev-ops/gatling-sandbox.git`

`cd gatling-sandbox`

`docker-compose up -d`

`docker run -it --network="gatling-sandbox" --rm -v ${PWD}/gatling:/root chatwork/scala-sbt:x86_64-ubuntu-jdk8u222-b10-2.12.8-1.2.8 sbt`

запуск тестов:
`gatling:testOnly ru.tinkoff.load.DebugTest`
`gatling:testOnly ru.tinkoff.load.StabilityTest`


graylog: localhost:9001
admin/admin

grafana: localhost:3000
admin/admin

graphite: localhost:2003