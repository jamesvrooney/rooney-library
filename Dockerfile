FROM amazonlinux:latest

RUN yum -y update
RUN yum -y install java-11-amazon-corretto shadow-utils

RUN useradd -m jamesvrooney
USER jamesvrooney

ENV JAVA_OPTS "-XX:-HeapDumpOnOutOfMemoryError -Xms5g -Xmx5g"

WORKDIR /home/jamesvrooney

COPY build/libs/rooney-library.jar /home/jamesvrooney/app.jar

EXPOSE 8080

ENTRYPOINT exec java $JAVA_OPTS -Duser.timezone=$TZ -jar /home/jamesvrooney/app.jar
