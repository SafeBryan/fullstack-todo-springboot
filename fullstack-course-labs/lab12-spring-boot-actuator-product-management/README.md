# Lab 12 - Gestión de productos con Spring Boot Actuator

## Descripción

En este laboratorio se desarrolló una aplicación de comercio electrónico utilizando Spring Boot, Spring MVC, Spring Data JPA, Spring Security, Thymeleaf, H2 Database y Spring Boot Actuator. La aplicación permite gestionar productos mediante una interfaz web segura y también mediante endpoints REST.

## Objetivo

Crear una aplicación Spring Boot con arquitectura MVC que permita a usuarios administradores gestionar productos y monitorear el estado de la aplicación mediante Spring Boot Actuator.

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Spring MVC
- Spring Data JPA
- Spring Security
- Thymeleaf
- H2 Database
- Spring Boot Actuator
- Maven
- Postman

## Actividades realizadas

- Se verificaron las dependencias necesarias en el archivo `pom.xml`.
- Se creó la entidad `Product` para representar los productos.
- Se creó el repositorio `ProductRepository` extendiendo `JpaRepository`.
- Se implementó la capa de servicio `ProductService`.
- Se creó la entidad `User` para manejar usuarios del sistema.
- Se creó el repositorio `UserRepository`.
- Se configuró `PasswordEncoder` con BCrypt.
- Se implementó `UserService` para crear usuarios por defecto.
- Se configuró Spring Security con roles ADMIN y USER.
- Se protegieron las rutas `/products/**` y `/actuator/**` para usuarios con rol ADMIN.
- Se creó un controlador MVC para gestionar productos mediante vistas Thymeleaf.
- Se creó un controlador REST para gestionar productos mediante API.
- Se diseñaron las vistas `products.html` y `product-form.html`.
- Se configuró la base H2 en memoria.
- Se habilitaron los endpoints de Spring Boot Actuator.
- Se probaron los endpoints con navegador y Postman.

## Usuarios por defecto

| Usuario | Contraseña | Rol   |
| ------- | ---------- | ----- |
| admin   | admin123   | ADMIN |
| user    | user123    | USER  |

## Endpoints MVC

| Método | Endpoint                | Descripción                             |
| ------ | ----------------------- | --------------------------------------- |
| GET    | `/products`             | Lista productos                         |
| GET    | `/products/add`         | Muestra formulario para añadir producto |
| POST   | `/products/add`         | Guarda nuevo producto                   |
| GET    | `/products/edit/{id}`   | Muestra formulario para editar producto |
| POST   | `/products/update/{id}` | Actualiza producto                      |
| GET    | `/products/delete/{id}` | Elimina producto                        |

## Endpoints REST

| Método | Endpoint             | Descripción               |
| ------ | -------------------- | ------------------------- |
| GET    | `/products/api`      | Lista todos los productos |
| GET    | `/products/api/{id}` | Obtiene producto por ID   |
| POST   | `/products/api`      | Crea producto             |
| PUT    | `/products/api/{id}` | Actualiza producto        |
| DELETE | `/products/api/{id}` | Elimina producto          |

## Endpoints Actuator

| Endpoint            | Descripción                      |
| ------------------- | -------------------------------- |
| `/actuator/health`  | Estado de salud de la aplicación |
| `/actuator/info`    | Información de la aplicación     |
| `/actuator/metrics` | Métricas de rendimiento          |

## Resultado

La aplicación permite administrar productos de forma segura mediante una interfaz web y una API REST. Además, Spring Boot Actuator permite monitorear el estado y rendimiento de la aplicación. Los endpoints sensibles están protegidos para el rol ADMIN.
