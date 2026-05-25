# Laboratorio 08 - Configuración inicial de QuickCart con Spring Boot

## Curso

Desarrollo Web Full Stack - Curso 5

## Módulo

Módulo 2 - Desarrollo web en Java

## Descripción

Este laboratorio consiste en configurar la estructura inicial de una aplicación web llamada QuickCart utilizando Spring Boot y Spring MVC. La aplicación representa una tienda en línea que posteriormente permitirá gestionar y mostrar productos a los clientes.

La configuración inicial se realizó mediante Spring Initializr, seleccionando Maven como gestor de dependencias, Java como lenguaje de programación y Spring Web como dependencia principal para el desarrollo web.

## Objetivo

Configurar la estructura básica de la aplicación web QuickCart, sentando las bases para construir y visualizar un catálogo de productos utilizando Spring Boot y el patrón Modelo-Vista-Controlador.

## Configuración del proyecto

- Project: Maven
- Language: Java
- Spring Boot: versión estable
- Group: `com.quickcart`
- Artifact: `ecommerce`
- Name: `QuickCart`
- Package name: `com.quickcart.ecommerce`
- Packaging: JAR
- Java: 21
- Dependency: Spring Web

## Conceptos revisados

- Tecnologías Java Server
- Cliente y servidor
- HTTP request y HTTP response
- Java Servlets
- Java Server Pages
- Spring Framework
- Spring Boot
- Servidor embebido Tomcat
- Arquitectura MVC
- Maven
- Archivo `pom.xml`
- Estructura de carpetas de un proyecto Spring Boot

## Estructura principal del proyecto

```text
ecommerce/
├── pom.xml
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/
    │   │       └── quickcart/
    │   │           └── ecommerce/
    │   │               └── QuickCartApplication.java
    │   └── resources/
    │       ├── static/
    │       ├── templates/
    │       └── application.properties
    └── test/
        └── java/
```
