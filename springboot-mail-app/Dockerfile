FROM openjdk:22-jdk
EXPOSE 8090
ADD ./springboot-mail-app/ /tmp
WORKDIR /tmp
#COPY springboot-mail-app/target/jenkins-docker-test.jar /mailSender/jenkins-docker-test.jar
CMD ["java","-jar","/tmp/target/jenkins-docker-test.jar"]
#ENTRYPOINT ["sh", "./docker_entrypoint.sh"]