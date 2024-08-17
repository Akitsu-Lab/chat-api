FROM eclipse-temurin:21-alpine

COPY . .
CMD ["./gradlew bootJar"]
CMD ["java", "-jar", "build/libs/chat-api.jar"]