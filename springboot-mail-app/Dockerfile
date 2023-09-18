FROM ubuntu:20.04
EXPOSE 8090
WORKDIR /mailSender
COPY ./springboot-mail-app/target/jenkins-docker-test.jar /mailSender/jenkins-docker-test.jar
CMD ["java","-jar","/mailSender/jenkins-docker-test.jar"]
#ENTRYPOINT ["sh", "./docker_entrypoint.sh"]