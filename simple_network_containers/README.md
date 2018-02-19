
Very simple bridge network between docker containers

1) from .../docker-play/simple_network_containers/simple-server/

`mvn install`

2) build the server image from .../docker-play/simple_network_containers/

`docker build -t pgfox/simple-netty-server -f Dockerfile.server .`

3) build the client image from .../docker-play/simple_network_containers/

`docker build -t pgfox/simple-netty-client -f Dockerfile.client .`

4) create a docker network

`docker network create --driver bridge netty-server-net`

5) run the simple-netty-server container using the "netty-server-net" with the name my-netty-server

`docker container run -d --name my-netty-server --network netty-server-net pgfox/simple-netty-server`

6) run the simple-netty-client container using the "netty-server-net"

`docker run -d --network netty-server-net pgfox/simple-netty-client`

To check if it worked

`docker logs <container-ID>`

should give logging output similar to the following

>SocketTest>> is about to create a socket to host:my-netty-server and port:5151
>SocketTest>> is about to write to the socket
>SocketTest>> received responsehello
