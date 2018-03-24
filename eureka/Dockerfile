FROM openjdk:8-jdk
COPY ./build/libs/eureka.jar /data/webapps/
EXPOSE 8001
CMD ["java","-jar","/data/webapps/eureka.jar"]