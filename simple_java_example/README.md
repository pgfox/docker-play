**quick and dirty** example of running a java process inside docker that exposes up a JRE debug port

1) build the jar

`cd .../docker-play/simple_java_example/simple-java
mvn install`

2) build the docker image (from .../docker-play/simple_java_example dir)

`docker build -t <docker-user-name>/simple_java_example .`

3) run the container

`docker run -p 5005:5005 -d <docker-user-name>/simple_java_example`

In this case I am mapping the debug port 5005 from the container to the local host 5005 port,
so point the IDE debugger at localhost 5005.

4) check the container is running as expected

`docker logs <container-id>`

it should show something like

>Listening for transport dt_socket at address: 5005
>It is 2018-02-17T20:20:14.232
>It is 2018-02-17T20:20:16.237
>It is 2018-02-17T20:20:18.238
>It is 2018-02-17T20:20:20.239
