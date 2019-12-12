# gatling-sandbox
Клонировать репозиторий
`git clone https://github.com/chepk/gatling-sandbox.git`

`cd gatling-sandbox`

Контейнеры с окружением
`docker-compose up -d`

Контейнер для запуска тестов
`docker run -it --network="gatling-sandbox" --rm -v ${PWD}/gatling:/root chatwork/scala-sbt:x86_64-ubuntu-jdk8u222-b10-2.12.8-1.2.8 sbt`

После запуска sbt ввести в консоль:
  дебаг - `gatling:testOnly ru.tinkoff.load.DebugTest`
  или
  тест - `gatling:testOnly ru.tinkoff.load.StabilityTest`

graylog: localhost:9001
admin/admin

grafana: localhost:3000
admin/admin

Проект gatling: `https://github.com/chepk/gatling-sandbox/tree/master/gatling`
