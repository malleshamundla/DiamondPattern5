






























# Use the official OpenJDK image as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the DiamondPattern.java file into the container's /app directory
COPY DiamondPattern.java .

# Compile the Java program
RUN javac DiamondPattern.java

# Command to run the Java program
CMD ["java", "DiamondPattern"]























