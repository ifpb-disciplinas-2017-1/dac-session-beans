mvn clean install 
docker stop app 
docker rm app
docker build -t ricardojob/app .
docker run -p 8081:8080 -d --name app ricardojob/app
docker container ls