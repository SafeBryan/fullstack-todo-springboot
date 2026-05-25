function showProductImage() {
  const productImageSection = document.getElementById("productImageSection");

  // TODO 2: Capturar la imagen con id "productImage"
  const productImage = document.getElementById("productImage");

  // TODO 3: Capturar la categoría seleccionada del desplegable
  const productCategory = document.getElementById("productCategory").value;

  const productCategoryError = document.getElementById("productCategoryError");

  // TODO 4: Asignar la imagen correcta según la categoría seleccionada
  if (productCategory === "phone") {
    productImage.src = "images/phone.png";
    productImage.alt = "Imagen de un teléfono";
    productCategoryError.innerHTML = "";
    productImageSection.style.display = "block";
  } else if (productCategory === "laptop") {
    productImage.src = "images/laptop.png";
    productImage.alt = "Imagen de una laptop";
    productCategoryError.innerHTML = "";
    productImageSection.style.display = "block";
  } else if (productCategory === "camera") {
    productImage.src = "images/camera.png";
    productImage.alt = "Imagen de una cámara";
    productCategoryError.innerHTML = "";
    productImageSection.style.display = "block";
  } else if (productCategory === "headphones") {
    productImage.src = "images/headphones.png";
    productImage.alt = "Imagen de auriculares";
    productCategoryError.innerHTML = "";
    productImageSection.style.display = "block";
  } else if (productCategory === "watch") {
    productImage.src = "images/smartwatch.png";
    productImage.alt = "Imagen de un reloj inteligente";
    productCategoryError.innerHTML = "";
    productImageSection.style.display = "block";
  } else {
    productImage.src = "";
    productImage.alt = "Imagen del producto seleccionado";
    productImageSection.style.display = "none";
    productCategoryError.innerHTML =
      "Debe seleccionar una categoría de producto.";
  }
}

function validateProductForm() {
  const productName = document.getElementById("productName").value;
  const productCategory = document.getElementById("productCategory").value;
  const resultMessage = document.getElementById("resultMessage");
  const productCategoryError = document.getElementById("productCategoryError");

  if (productName.trim() === "") {
    resultMessage.style.color = "#dc3545";
    resultMessage.innerHTML = "Debe ingresar el nombre del producto.";
    return;
  }

  if (productCategory === "") {
    productCategoryError.innerHTML =
      "Debe seleccionar una categoría de producto.";
    resultMessage.style.color = "#dc3545";
    resultMessage.innerHTML = "El formulario no está completo.";
    return;
  }

  productCategoryError.innerHTML = "";
  resultMessage.style.color = "#28a745";
  resultMessage.innerHTML = "Producto validado correctamente.";
}

function resetProductImage() {
  const productImageSection = document.getElementById("productImageSection");
  const productImage = document.getElementById("productImage");
  const productCategoryError = document.getElementById("productCategoryError");
  const resultMessage = document.getElementById("resultMessage");

  productImage.src = "";
  productImage.alt = "Imagen del producto seleccionado";
  productImageSection.style.display = "none";
  productCategoryError.innerHTML = "";
  resultMessage.innerHTML = "";
}
