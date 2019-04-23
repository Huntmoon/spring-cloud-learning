FROM openjdk:8-jre-alpine
COPY ./build/libs/eureka.jar /data/webapps/
EXPOSE 9001
CMD ["java","-jar","/data/webapps/eureka.jar"]