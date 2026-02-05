# Demo Spring Boot App

## Run locally (requires Java 21+ and Gradle)

Build:

```
gradle clean build
```

Run:

```
java -jar build/libs/app.jar
```

## Render (Docker)

This repo includes a `Dockerfile` and `render.yaml`. On Render, create a new Blueprint service from this repo.

Notes:
- Render sets `PORT` automatically. The app reads it via `server.port=${PORT:8080}`.
- If your environment does not include Gradle, run `gradle wrapper` locally and commit the wrapper files.
