FROM java:8
VOLUME /tmp
ADD demo.jar demo.jar
EXPOSE 8080
RUN bash -c 'touch /demo.jar'
ENTRYPOINT ["java", "-Xms512m", "-Xmx1g", "-jar", "demo.jar"]
