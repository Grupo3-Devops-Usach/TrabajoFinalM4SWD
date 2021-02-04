# Trabajo Final Módulo 4 - Pruebas Automatizadas
# Grupo 3

## Integrantes

* Carlo Figueroa
* Johnny Márquez
* Albert Muñoz
* Carlos Riveros
* Maricel Rodríguez
* Cristian Tapia

## Pre requisitos para ejecución de Jenkinsfile

* NodeJs: https://nodejs.org/es/download/
* Newman: npm install -g newman
* Htmlextra: npm install -g newman-reporter-htmlextra

## Windows

### Compile Code
* ./mvnw.cmd clean compile -e

### Jar Code
* ./mvnw.cmd clean package -e

### Run Jar
* Local:      ./mvnw.cmd spring-boot:run 
* Background: start mvnw.cmd spring-boot:run

### Test Code & JMeter & Selenium Driver
* ./mvnw.cmd verify -Pperformance

### Testing Application
* Abrir navegador: http://localhost:8080/

## Linux

### Compile Code
* ./mvnw clean compile -e

### Jar Code
* ./mvnw clean package -e

### Run Jar
* Local:      ./mvnw spring-boot:run 
* Background: nohup bash mvnw spring-boot:run &

### Test Code & JMeter & Selenium Driver
* ./mvnw.cmd verify -Pperformance

### Testing Application
* Abrir navegador: http://localhost:8080/
