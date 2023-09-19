FROM openjdk:22-jdk
EXPOSE 8090
ADD . /mailSender
WORKDIR /mailSender
#COPY springboot-mail-app/target/jenkins-docker-test.jar /mailSender/jenkins-docker-test.jar
CMD ["java","-jar","/mailSender/jenkins-docker-test.jar"]
#ENTRYPOINT ["sh", "./docker_entrypoint.sh"]