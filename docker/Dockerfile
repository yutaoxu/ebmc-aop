FROM openjdk:8-jdk-alpine 
ADD ./ebmc-0.0.1-SNAPSHOT.jar /home/app.jar
EXPOSE 7777 
ENTRYPOINT exec java -jar /home/app.jar
