# Repository Comparison

## Requirements

It requires `docker` and `docker-compose`.

## Installation

In project directory run command:

```bash
docker-compose -f infrastructure/docker/docker-compose.yml up -d
```

To run project you have to run this:

```bash
docker-compose -f infrastructure/docker/docker-compose.yml exec kotlin /bin/bash -c "./gradlew run"
```
