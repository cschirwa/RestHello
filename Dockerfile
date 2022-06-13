# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
LABEL maintainer="blaqfox<cschirwa@gmail.com>"

# Copy jar file
COPY RestHello-0.0.1-SNAPSHOT.jar /rest-hello.jar

EXPOSE 8080

# run the app
CMD ["/usr/bin/java", "-jar", "/rest-hello.jar"]