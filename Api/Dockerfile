FROM java:8-alpine
EXPOSE 5000
WORKDIR /usr/app/api

ADD target/api.jar /usr/app/api/

CMD [ "java","-jar","api.jar" ]
