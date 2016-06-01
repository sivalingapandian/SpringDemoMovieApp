FROM java:8
VOLUME /tmp
ADD moviedemo.jar moviedemo.jar
EXPOSE 8080
RUN bash -c 'touch /moviedemo.jar'
ENTRYPOINT ["java","-Xms512m", "-Xmx1g","-jar","moviedemo.jar"]