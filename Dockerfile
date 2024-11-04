FROM eclipse-temurin:21-alpine
RUN mkdir /opt/app
COPY target/w1.jar /opt/app
EXPOSE 8080
ENTRYPOINT ["java","-jar","/opt/app/w1.jar"]
