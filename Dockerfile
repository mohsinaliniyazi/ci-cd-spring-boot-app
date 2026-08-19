FROM eclipse-temurin:21-jre
LABEL maintainer = "mohsinali.com"
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]