FROM maven:3.6.3-openjdk-11 as package
ARG JAR_FILE
ENV TZ=America/Sao_Paulo
RUN mkdir app
#ENV MAVEN_CONFIG=/var/maven/.m2
#COPY $PWD/tmp /usr/share/maven/ref/
COPY $PWD/target/app.jar /app
#RUN mv target/*.jar app.jar
WORKDIR /app
#COPY $PWD/tmp/settings.xml /usr/share/maven/ref/
#RUN mvn package -s /usr/share/maven/ref/settings-docker.xml -Duser.home=/var/maven/.m2
ENTRYPOINT java -jar app.jar
#NTRYPOINT mvn spring-boot:run
