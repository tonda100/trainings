# MicroProfile


```bash
docker build -t tonda100/microprofile-prometheus .

docker run -d --name prometheus --network microprofile -p 9090:9090 tonda100/microprofile-prometheus

docker run -d --name grafana --network microprofile -p 3000:3000 grafana/grafana:5.4.1

```
