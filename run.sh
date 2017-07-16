mvn clean install 
docker stop banco 
docker rm banco
docker stop app 
docker rm app
docker build -t ricardojob/banco ./postgres
docker build -t ricardojob/app .
docker run -p 5433:5432 -d --name banco ricardojob/banco
docker run -p 8081:8080 -p 3700:3700 -d --name app --link banco:host-banco ricardojob/app
docker container ls