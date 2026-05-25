# Laboratorio 06 - Interactividad con JavaScript

## Curso

Desarrollo Web Full Stack - Curso 5

## Módulo

Módulo 1 - Desarrollo Frontend

## Descripción

Este laboratorio consiste en integrar JavaScript dentro de una página HTML para mejorar la interactividad de una aplicación de registro de productos. La página permite seleccionar una categoría de producto desde una lista desplegable y mostrar dinámicamente la imagen correspondiente sin recargar la página.

## Objetivo

Integrar JavaScript para mejorar la interactividad de la página, añadiendo funciones como la visualización dinámica de imágenes y elementos de interfaz adaptables.

## Archivos incluidos

- `index.html`
- `styles.css`
- `script.js`
- `images/phone.png`
- `images/laptop.png`
- `images/camera.png`
- `images/headphones.png`
- `images/smartwatch.png`

## Funcionalidades implementadas

- Vinculación de un archivo JavaScript externo mediante `script.js`.
- Uso del evento `onclick` en un elemento desplegable.
- Creación de la función `showProductImage()`.
- Captura del valor seleccionado mediante `document.getElementById().value`.
- Manipulación del DOM mediante JavaScript.
- Cambio dinámico del atributo `src` de una imagen.
- Visualización dinámica de una sección oculta.
- Validación básica del formulario.
- Limpieza del formulario y ocultamiento de la imagen.
- Uso de mensajes de error y confirmación.

## Conceptos aplicados

- JavaScript básico
- Variables con `const`
- Funciones
- Eventos
- Condicionales `if`, `else if`, `else`
- Manipulación del DOM
- `document.getElementById`
- `.value`
- `.innerHTML`
- `.style.display`
- `.src`
- `.alt`

## Funcionamiento

Cuando el usuario selecciona una categoría de producto, JavaScript identifica el valor seleccionado y asigna la imagen correspondiente al elemento `<img>`. Además, la sección de imagen se muestra dinámicamente usando `style.display = "block"`.

## Evidencia

Este laboratorio fue completado como parte del curso de Desarrollo Web Full Stack. Las capturas del código, la vista en navegador, la selección de categorías y la visualización dinámica de imágenes pueden utilizarse como evidencia de aprendizaje.

## Autor

Bryan Pazmiño
