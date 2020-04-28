FROM java:8-jdk-alpine
COPY ./target/myapp-1.0.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "myapp-1.0.jar"]
