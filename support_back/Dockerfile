FROM openjdk:22
EXPOSE 8080
ADD target/docker_support.jar docker_support.jar
ENTRYPOINT ["java", "-jar", "/docker_support.jar"]