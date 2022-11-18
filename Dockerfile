FROM sandeep4642/java-11:1

RUN apt-get update && apt-get install -y git curl libmcrypt-dev default-mysql-client -y

RUN mkdir /apps

COPY ./target/*.jar /apps/spring.jar

EXPOSE 8080

CMD java -jar /apps/spring.jar
