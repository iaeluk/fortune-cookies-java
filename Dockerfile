FROM openjdk:11-jre

COPY build/libs/api-0.0.1-SNAPSHOT.jar /app.jar

CMD ["java", "-jar", "/app.jar"]