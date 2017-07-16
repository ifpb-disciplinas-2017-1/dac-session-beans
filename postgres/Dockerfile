FROM postgres
MAINTAINER Ricardo Job <sousajob@gmail.com>
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD 12345
ENV POSTGRES_DB cliente
COPY create.sql /docker-entrypoint-initdb.d/
COPY insert.sql /docker-entrypoint-initdb.d/
#postgres-volume-db:/var/lib/postgresql/data/
 
