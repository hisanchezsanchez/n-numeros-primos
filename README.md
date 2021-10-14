# Run Code in local
## From [docker hub](https://hub.docker.com/repository/docker/srhit/n-num-primos)
````shell
docker container run --rm -it srhit/n-num-primos:1.0
````
## from local
### Requirements

Java 11
Maven

### Compilation

````shell
mvn clean package
````
### Run java jar 
````shell
java -jar target/n-primeros-primos-1.0.jar
````
escribe un numero en la consola para saber los primeros n numeros


# Docker build file 
````shell
mvn clean package ; docker image build -t srhit/n-num-primos:1.0  .
````
#Run in docker container with interactive console


