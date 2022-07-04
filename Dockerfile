FROM openjdk:8-jdk

LABEL maintainer="gltlvl12@gmail.com"

EXPOSE 8080

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]