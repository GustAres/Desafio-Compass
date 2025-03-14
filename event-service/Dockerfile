
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/event-service.jar event-service.jar

EXPOSE 8080

CMD ["java", "-jar", "event-service.jar"]