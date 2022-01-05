FROM openjdk:11
ADD target/cloud-cicd/cloud-cicd.jar cloud-cicd.jar
EXPOSE 9096
ENTRYPOINT ["java","-jar","cloud-cicd.jar"]
