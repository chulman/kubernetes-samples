FROM java:openjdk-8-jdk

MAINTAINER cmchoi, chlcjfals0122@gmail.com

WORKDIR /program/bootapp
ADD build/libs/app.jar app.jar

EXPOSE 8080
CMD ["/bin/bash", "-c", "exec java -jar app.jar"]
