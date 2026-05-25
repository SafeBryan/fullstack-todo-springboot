# Lab 11 - Spring Data JPA y CRUD REST de Productos

## Descripción

En este laboratorio se integró Spring Data JPA en la aplicación Spring Boot creada previamente. El objetivo fue implementar operaciones CRUD para gestionar productos de una tienda en línea, utilizando una base de datos H2 en memoria y exponiendo las operaciones mediante endpoints REST.

## Objetivo

Utilizar Spring Data JPA para simplificar el acceso a datos y permitir la creación, lectura, actualización y eliminación de productos mediante una API REST protegida con autenticación básica.

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Spring Web MVC
- Spring Security
- Spring Data JPA
- H2 Database
- Maven
- Postman

## Actividades realizadas

- Se agregaron las dependencias de Spring Data JPA y H2 en el archivo `pom.xml`.
- Se configuró la base de datos H2 en `application.properties`.
- Se creó la entidad `Product` con anotaciones JPA.
- Se creó el repositorio `ProductRepository` extendiendo `JpaRepository`.
- Se implementó la capa de servicio `ProductService` para manejar la lógica de productos.
- Se creó el controlador REST `ProductController`.
- Se implementaron endpoints para crear, listar, buscar, actualizar y eliminar productos.
- Se actualizó la configuración de seguridad para permitir autenticación básica en `/products/**`.
- Se probaron los endpoints con Postman usando Basic Auth.

## Endpoints implementados

| Método | Endpoint         | Descripción                     |
| ------ | ---------------- | ------------------------------- |
| GET    | `/products`      | Lista todos los productos       |
| GET    | `/products/{id}` | Obtiene un producto por ID      |
| POST   | `/products/add`  | Crea un nuevo producto          |
| PUT    | `/products/{id}` | Actualiza un producto existente |
| DELETE | `/products/{id}` | Elimina un producto             |

## Credenciales de prueba

```text
Username: user
Password: user123
```
