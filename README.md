CI-CD-com-GitHub-Actions
RESTful API built with Java Spring Boot, containerized with Docker and deployed to AWS EC2 via CI/CD pipeline using GitHub Actions.
Technologies

Java 17 + Spring Boot
Maven
Docker + Docker Hub
GitHub Actions (CI/CD)
AWS EC2

Pipeline

CI: triggered on Pull Request → build → unit tests → Docker image push to Docker Hub
CD: triggered on push to main → pulls latest image → restarts container on EC2

Endpoints
MethodRouteDescriptionPOST/divisao/{a}/{b}Divides two numbersGET/actuator/healthHealth check
