# Etapa de construcción 
FROM maven:3.9.6-eclipse-temurin-21 AS build

# Establece el directorio de trabajo
WORKDIR /app

# Copia solo el proyecto Maven que está en medidor/
COPY medidor /app

# Empaqueta el proyecto sin ejecutar tests
RUN mvn clean package -DskipTests

# Etapa de ejecución
FROM eclipse-temurin:21-jdk

# Establece directorio de trabajo
WORKDIR /app

# Expone el puerto 8080
EXPOSE 8080

# Copia el JAR generado
COPY --from=build /app/target/*.jar app.jar

# Ejecuta la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
