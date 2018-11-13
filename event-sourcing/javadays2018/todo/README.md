# Event Sourcing

This is example Todo application using Event Sourcing approach.

There is Kafka used as Event Store. Can be started by attached [docker-compose.yml](docker-compose.yml)

Using JavaEE 8 and [kafka-eventstore](https://github.com/tonda100/eventstore-kafka) library. Deployed on [OpenLiberty](https://openliberty.io/)

Commands:
```bash
curl -X POST -H "Content-Type: application/json" --data '{"name": "koupit rohliky", "when": "nikdy"}'   http://localhost:9080/api/todos

curl http://localhost:9080/api/todos
```
