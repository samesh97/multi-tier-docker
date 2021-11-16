FROM node:14-alpine
WORKDIR /app

ADD package.json /app
RUN npm install

COPY . /app

CMD ["npm","run","start"]