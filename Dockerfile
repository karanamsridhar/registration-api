FROM openjdk:8
ADD target/registration.jar registration.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "registration.jar"]