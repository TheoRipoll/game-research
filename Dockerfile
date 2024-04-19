
# Stage 1: Build the application with Gradle
FROM gradle:7.3.3-jdk-17-slim AS build
WORKDIR /app
COPY build.gradle .
COPY settings.gradle .
COPY gradle.properties .
COPY gradlew .
COPY gradle/ ./gradle/
RUN ./gradlew build --no-daemon

# Stage 2: Create the final image
FROM adoptopenjdk/openjdk17:jre-17.0.2_8-alpine
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
