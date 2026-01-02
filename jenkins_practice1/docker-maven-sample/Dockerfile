FROM docker-snapshot.cernerrepos.net/rccloud/sf-adoptopenjdk-alpine:0.0.106-SNAPSHOT-20250117T150000Z
COPY target/demo-0.0.1-SNAPSHOT.jar /usr/app/demo-0.0.1-SNAPSHOT.jar  
EXPOSE 8080  
CMD ["java","-jar","/usr/app/demo-0.0.1-SNAPSHOT.jar"]