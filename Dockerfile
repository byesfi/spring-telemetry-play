FROM eclipse-temurin:21-jre

ADD target/spring-telemetry-play-0.0.1.jar /stp.jar
ADD target/agent/optel-agent.jar /optel-agent.jar

ENTRYPOINT java -javaagent:/optel-agent.jar \
                -Dotel.logs.exporter=logging \
                -Dotel.metrics.exporter=logging \
                -Dotel.traces.exporter=logging \
                -jar /stp.jar