#!/bin/sh

./gradlew clean build
docker build  -t chulm/health-check-app:latest .
docker tag chulm/health-check-app:latest chulm/health-check-app:latest
docker push chulm/health-check-app:latest