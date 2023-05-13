FROM openjdk:17
EXPOSE 8080
ADD target/pii-data-masking.jar pii-data-masking.jar
ENTRYPOINT ["java", "-jar", "/pii-data-masking.jar"]