#FROM tomcat:latest
#ADD target/w1.war /usr/local/tomcat/webapps/
#EXPOSE 8080
#CMD ["catalina.sh", "run"]

FROM openjdk:latest
COPY target/w1.jar /w1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/w1.jar"]
