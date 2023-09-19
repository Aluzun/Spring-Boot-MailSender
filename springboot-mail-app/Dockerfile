FROM openjdk:22-jdk
EXPOSE 8090
WORKDIR /mailSender
COPY target/jenkins-docker-test.jar /mailSender/jenkins-docker-test.jar
CMD ["java","-jar","/mailSender/jenkins-docker-test.jar"]
#ENTRYPOINT ["sh", "./docker_entrypoint.sh"]