# Maven Docker fabric8 plugin example


## Create Spring Boot Docker image and push to Docker Hub

mvn clean package -Pdocker


## Run Spring Boot application inside Docker container

mvn clean install -Pdocker

## Microservice

curl http://localhost:8082/api/v1/students
