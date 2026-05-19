FROM maven:3-openjdk-17 AS builder
LABEL authors="GuiMontin"
WORKDIR /build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=builder /build/target/*.jar /app/app.jar
CMD ["java", "-jar", "app.jar"]git add Dockerfile
                               git commit -m "fix: update base image to eclipse-temurin"
                               git push origin develop