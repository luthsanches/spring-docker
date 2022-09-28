FROM maven:3.8.6-jdk-11-slim as build
RUN mkdir -p /opt/spring-docker
WORKDIR /opt/spring-docker
COPY pom.xml /opt/spring-docker
COPY src /opt/spring-docker/src
RUN mvn -B -f pom.xml clean package -DskipTests

FROM openjdk:11.0.2-jre-slim
COPY --from=build /opt/spring-docker/target/*.jar spring-docker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-docker.jar"]