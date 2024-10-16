FROM openjdk:17-jdk-alpine
COPY src ./src
RUN mvn clean package -DskipTests && rm -rf /root/.m2/repository
ADD target/devops-integration.jar devops-integration.jar
ENTRYPOINT ["java","-jar","/devops-integration.jar"]