FROM maven:3.9-eclipse-temurin-21

WORKDIR /app

COPY . .

RUN mvn clean package

EXPOSE 7860

CMD ["java","-jar","target/java-ai-meal-calorie-agent-0.0.1-SNAPSHOT.jar","--server.port=7860"]
