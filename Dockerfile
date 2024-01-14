FROM eclipse-temurin:21-jre

ADD target/spring-telemetry-play-0.0.1.jar /stp.jar
ADD target/agent/otel-agent.jar /otel-agent.jar

ENTRYPOINT java -javaagent:/otel-agent.jar -jar /stp.jar