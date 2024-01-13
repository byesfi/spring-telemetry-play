FROM eclipse-temurin:21-jre

ADD target/spring-telemetry-play-0.0.1.jar /stp.jar
ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar

ENTRYPOINT java -javaagent:/opentelemetry-javaagent.jar \
                -Dotel.logs.exporter=logging \
                -Dotel.metrics.exporter=logging \
                -Dotel.traces.exporter=logging \
                -jar /stp.jar