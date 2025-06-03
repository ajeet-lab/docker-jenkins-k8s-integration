FROM openjdk:17
EXPOSE 8081
ADD target/docker-jenkins-k8s-integration.jar docker-jenkins-k8s-integration.jar
ENTRYPOINT ["java", "-jar", "docker-jenkins-k8s-integration.jar"]