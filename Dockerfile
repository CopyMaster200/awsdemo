FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/pegasus.jar pegasus.jar
ENTRYPOINT  ["java","-jar","pegasus.jar"]