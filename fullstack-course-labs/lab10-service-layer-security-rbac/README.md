# Lab 10 - Service Layer, Configuración y Seguridad RBAC

## Descripción

En este laboratorio se continuó trabajando con el proyecto Spring Boot creado previamente. Se implementó una capa de servicio para separar la lógica de negocio del controlador, se configuraron propiedades básicas de la aplicación y se añadió seguridad basada en roles utilizando Spring Security.

## Objetivo

Aplicar buenas prácticas de organización en una aplicación Spring Boot mediante el uso de servicios, configuración externa y control de acceso basado en roles.

## Actividades realizadas

- Creación de una capa de servicio con `WelcomeService`.
- Modificación del controlador REST para consumir la lógica desde el servicio.
- Configuración básica de la aplicación mediante `application.properties`.
- Implementación de Spring Security.
- Creación de usuarios en memoria con roles `USER` y `ADMIN`.
- Codificación de contraseñas mediante `BCryptPasswordEncoder`.
- Creación de formularios de registro e inicio de sesión con Thymeleaf.
- Configuración de rutas públicas y rutas protegidas.
- Aplicación de control de acceso basado en roles.
- Uso de `@PreAuthorize` para proteger métodos del controlador.
- Pruebas de acceso con usuario normal y administrador.

## Credenciales de prueba

### Usuario normal

- Usuario: `user`
- Contraseña: `user123`
- Rol: `USER`

### Administrador

- Usuario: `admin`
- Contraseña: `admin123`
- Rol: `ADMIN`

## Endpoints principales

| Endpoint           | Acceso              |
| ------------------ | ------------------- |
| `/`                | Público             |
| `/api/welcome`     | Público             |
| `/register`        | Público             |
| `/login`           | Público             |
| `/welcome`         | Usuario autenticado |
| `/user/profile`    | USER y ADMIN        |
| `/admin/dashboard` | ADMIN               |

## Resultado

La aplicación permite registrar usuarios, iniciar sesión y controlar el acceso a diferentes páginas según el rol asignado. Además, se reforzó la arquitectura separando la lógica de negocio en una capa de servicio, dejando al controlador enfocado únicamente en recibir solicitudes y devolver respuestas.
