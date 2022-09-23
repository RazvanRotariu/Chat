#add postgresql
FROM postgres:13.3-alpine
#add database
COPY ./database.sql /docker-entrypoint-initdb.d/

ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=postgres
ENV POSTGRES_DB=postgres
#port 5432
EXPOSE 5432
#start postgresql
CMD ["postgres"]