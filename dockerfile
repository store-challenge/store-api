# FROM eclipse-temurin:17-jdk-alpine
# VOLUME /tmp
# EXPOSE 8080
# ARG JAR_FILE=target/spring-boot-docker.jar
# COPY ${JAR_FILE} app.jar
# CMD ["java","-jar","/app.jar"]

# FROM maven:3.8.5 AS build  
# COPY src/main /usr/src/app/src/main  
# COPY pom.xml /usr/src/app  
# RUN mvn -f /usr/src/app/pom.xml package

FROM openjdk:17
VOLUME /tmp
COPY target/megastore-0.0.1-SNAPSHOT.jar /usr/app/megastore.jar  
EXPOSE 8081
ENTRYPOINT ["java","-jar","/usr/app/megastore.jar"]  