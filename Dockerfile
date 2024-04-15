FROM maven:3-openjdk-11
# Set working directory
WORKDIR /usr/src/app

# Copy the project files into the container
COPY . .

EXPOSE 8080
# Specify the command to run the application
CMD ["java","-jar","target/cloudtest-0.0.1-SNAPSHOT.jar"]