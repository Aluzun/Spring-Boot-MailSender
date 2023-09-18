FROM ubuntu:20.04
EXPOSE 8090
USER root
RUN apt-get update -y && \
	apt-get install openjdk-17-jdk -y && \
	apt -y install net-tools && \
	apt-get install -y iputils-ping && \
	apt install -y traceroute && \
	apt-get install -y grep && \
	apt install -y vim && \
	apt-get install -y procps && \
	apt-get install tar -y && \
	apt-get install -y tcpdump
WORKDIR /mailSender
COPY /var/jenkins_home/workspace/First Maven Project/springboot-mail-app/target/jenkins-docker-test.jar /mailSender/jenkins-docker-test.jar
CMD ["java","-jar","/mailSender/jenkins-docker-test.jar"]
#ENTRYPOINT ["sh", "./docker_entrypoint.sh"]