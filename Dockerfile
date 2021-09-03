FROM docker.io/maven:3-jdk-8 AS builder
WORKDIR /home/app
ADD src ./src
ADD pom.xml .
RUN mvn package


FROM docker.io/tomcat:8
RUN rm -Rf /usr/local/tomcat/webapps/*
COPY --from=builder /home/app/target/Hello-world-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
RUN ls /usr/local/tomcat/webapps/
RUN chgrp -R 0 /usr/local/tomcat/ && \
    chmod -R g=u /usr/local/tomcat/
CMD ["catalina.sh", "run"]
EXPOSE 8080
