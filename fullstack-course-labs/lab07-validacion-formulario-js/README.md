# Laboratorio 07 - Validación de formulario con JavaScript

## Curso

Desarrollo Web Full Stack - Curso 5

## Módulo

Módulo 1 - Desarrollo Frontend

## Descripción

Este laboratorio consiste en implementar validaciones con JavaScript en una página de registro de productos. El formulario valida campos obligatorios, valores numéricos, correo electrónico y número telefónico antes de mostrar el mensaje de confirmación.

## Objetivo

Añadir validación JavaScript a todos los campos de la página de registro del producto para mejorar la calidad de los datos ingresados por el usuario y evitar envíos incompletos o incorrectos.

## Archivos incluidos

- `index.html`
- `styles.css`
- `script.js`

## Funcionalidades implementadas

- Captura de valores del formulario mediante `document.getElementById()`.
- Validación de nombre del producto.
- Validación de categoría del producto.
- Validación de ID del producto.
- Validación de número de serie.
- Validación de garantía entre 1 y 5 años.
- Validación de precio positivo.
- Validación de nombre del vendedor.
- Validación básica de correo electrónico usando `includes("@")`.
- Validación de número telefónico de 10 dígitos usando expresión regular.
- Visualización de mensajes de error.
- Limpieza de mensajes de error.
- Ocultamiento del formulario al completar correctamente.
- Visualización de mensaje de agradecimiento.

## Conceptos aplicados

- JavaScript
- Funciones
- Eventos
- Condicionales `if`
- Manipulación del DOM
- `document.getElementById()`
- `.value`
- `.trim()`
- `.innerHTML`
- `.style.display`
- `querySelectorAll()`
- `forEach()`
- Expresiones regulares
- Validación de formularios

## Validaciones realizadas

| Campo               | Validación                        |
| ------------------- | --------------------------------- |
| Nombre del producto | Obligatorio                       |
| Categoría           | Debe seleccionarse una opción     |
| ID del producto     | Obligatorio                       |
| Número de serie     | Obligatorio                       |
| Garantía            | Debe estar entre 1 y 5 años       |
| Precio              | Debe ser mayor que 0              |
| Vendedor            | Obligatorio                       |
| Correo electrónico  | Debe contener `@`                 |
| Teléfono            | Debe tener exactamente 10 dígitos |

## Evidencia

Este laboratorio fue completado como parte del curso de Desarrollo Web Full Stack. Las capturas del formulario, los mensajes de error, la validación correcta y el código JavaScript pueden utilizarse como evidencia de aprendizaje.

## Autor

Bryan Pazmiño
