# Laboratorio 09 - Configuración básica de un proyecto Spring Boot

## Curso

Desarrollo Web Full Stack - Módulo 2

## Descripción

En este laboratorio se configuró un nuevo proyecto Spring Boot utilizando Spring Initializr e IntelliJ IDEA. El propósito fue comprender cómo se genera la estructura inicial de una aplicación Spring Boot, cómo se agregan dependencias básicas y cómo se ejecuta una aplicación web Java con servidor embebido.

Este laboratorio permitió reforzar el uso de Spring Initializr como herramienta para crear proyectos Spring Boot de forma rápida, evitando configuraciones manuales extensas y facilitando el inicio del desarrollo de aplicaciones web.

## Objetivo

Configurar un nuevo proyecto Spring Boot utilizando Spring Initializr, Maven, Java y la dependencia Spring Web.

## Configuración utilizada

- Project: Maven
- Language: Java
- Spring Boot: versión estable
- Group: `org.amazon`
- Artifact: `example`
- Name: `example`
- Package name: `org.amazon.example`
- Packaging: JAR
- Java: 21
- Dependency: Spring Web

## Actividades realizadas

1. Se ingresó a Spring Initializr desde el navegador.
2. Se configuró un nuevo proyecto Spring Boot con Maven y Java.
3. Se seleccionó la dependencia Spring Web para permitir el desarrollo de aplicaciones web.
4. Se generó y descargó el proyecto en formato ZIP.
5. Se extrajo el proyecto descargado.
6. Se abrió el proyecto en IntelliJ IDEA.
7. Se revisó la estructura estándar generada por Spring Initializr.
8. Se identificaron las carpetas principales del proyecto:
   - `src/main/java`
   - `src/main/resources`
   - `src/test/java`
9. Se revisó el archivo `pom.xml`, donde se gestionan las dependencias del proyecto.
10. Se ejecutó la clase principal de la aplicación Spring Boot.
11. Se comprobó que el servidor embebido Tomcat inició correctamente en el puerto 8080.

## Conceptos aprendidos

- Spring Boot
- Spring Initializr
- Maven
- Dependencias Starter
- Spring Web
- Servidor embebido Tomcat
- Archivo `pom.xml`
- Estructura estándar de un proyecto Spring Boot
- Clase principal con `@SpringBootApplication`
- Ejecución de aplicaciones Spring Boot desde IntelliJ IDEA

## Estructura del proyecto

```text
example/
├── pom.xml
└── src/
    ├── main/
    │   ├── java/
    │   │   └── org/
    │   │       └── amazon/
    │   │           └── example/
    │   │               └── ExampleApplication.java
    │   └── resources/
    │       ├── static/
    │       ├── templates/
    │       └── application.properties
    └── test/
        └── java/
```

## Actividad adicional: Controlador REST básico

Como parte del laboratorio, se creó un controlador REST utilizando Spring Boot. El objetivo fue comprender cómo una aplicación puede responder a solicitudes HTTP mediante endpoints.

Se creó la clase `WelcomeController` dentro del paquete `controller`, utilizando las anotaciones `@RestController` y `@GetMapping`.

El endpoint implementado fue:

```text
GET /welcome
```
