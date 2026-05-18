# CI-CD-com-GitHub-Actions

RESTful API built with Java Spring Boot, containerized with Docker and deployed to AWS EC2 via CI/CD pipeline using GitHub Actions.

## Technologies
- Java 17 + Spring Boot
- Maven
- Docker + Docker Hub
- GitHub Actions (CI/CD)
- AWS EC2

## Pipeline
- **CI:** triggered on Pull Request → build → unit tests → Docker image push to Docker Hub
- **CD:** triggered on push to main → pulls latest image → restarts container on EC2

## Endpoints
| Method | Route | Description |
|--------|-------|-------------|
| POST | `/divisao/{a}/{b}` | Divides two numbers |
| GET | `/actuator/health` | Health check |

## How to run locally
```bash
docker pull guimontin/demo:latest
docker run -p 8080:8080 guimontin/demo:latest
```
