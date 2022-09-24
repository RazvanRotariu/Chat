FROM openjdk:18-alpine
VOLUME /tmp
COPY target/*.jar tmp/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "tmp/app.jar"]

