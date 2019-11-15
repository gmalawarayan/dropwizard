FROM openjdk:11-slim
ADD target/dropwizard-example-2.0.0-rc13-SNAPSHOT.jar /data/drop-wizard-example.jar
ADD example.keystore /example.keystore
ADD example.yml /data/example.yml
RUN java -jar /data/drop-wizard-example.jar db migrate /data/example.yml
CMD java -jar /data/drop-wizard-example.jar server /data/example.yml
