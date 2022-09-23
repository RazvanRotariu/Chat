FROM openjdk:17-alpine
VOLUME /tmp
COPY target/*.jar tmp/app.jar

ENTRYPOINT ["java", "-jar", "tmp/app.jar"]