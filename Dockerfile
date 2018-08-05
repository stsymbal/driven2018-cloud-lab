FROM frolvlad/alpine-oraclejdk8:slim

ENV MY_PORT 8080

EXPOSE $MY_PORT

VOLUME /tmp
ADD target/ZeroToCloudIn30MinLab-*.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Dserver.port=$MY_PORT -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
