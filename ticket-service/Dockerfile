
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/ticket-service.jar ticket-service.jar

EXPOSE 8081

CMD ["java", "-jar", "ticket-service.jar"]