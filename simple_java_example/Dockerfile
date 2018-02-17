FROM openjdk:alpine

RUN mkdir -p /opt/simple-java

COPY /simple-java/target/simple-java-1.0.jar /opt/simple-java/
WORKDIR /opt/simple-java/

EXPOSE 5005

CMD ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005", "-cp", "simple-java-1.0.jar", "com.acme.PrintTime"]
