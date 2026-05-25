function submitForm() {
  let isValid = true;

  // TODO 1: Obtener valores usando getElementById()
  const productName = document.getElementById("productName").value.trim();
  const productCategory = document.getElementById("productCategory").value;
  const productID = document.getElementById("productID").value.trim();
  const serialNumber = document.getElementById("serialNumber").value.trim();
  const warranty = document.getElementById("warranty").value;
  const price = document.getElementById("price").value;
  const vendor = document.getElementById("vendor").value.trim();
  const email = document.getElementById("email").value.trim();
  const phoneNumber = document.getElementById("phoneNumber").value.trim();

  clearErrors();

  // Validación del nombre del producto
  if (!productName) {
    displayError("productNameError", "Product name is required.");
    isValid = false;
  }

  // TODO 2: Validación de categoría del producto
  if (!productCategory) {
    displayError("productCategoryError", "Please select a product category.");
    isValid = false;
  }

  // TODO 3: Validación de ID del producto
  if (!productID) {
    displayError("productIDError", "Product ID is required.");
    isValid = false;
  }

  // TODO 4: Validación de número de serie
  if (!serialNumber) {
    displayError("serialNumberError", "Serial Number is required.");
    isValid = false;
  }

  // TODO 5: Validación de garantía entre 1 y 5 años
  if (!warranty || Number(warranty) < 1 || Number(warranty) > 5) {
    displayError("warrantyError", "Warranty must be between 1 and 5 years.");
    isValid = false;
  }

  // TODO 6: Validación de precio positivo
  if (!price || Number(price) <= 0) {
    displayError("priceError", "Price must be a positive number.");
    isValid = false;
  }

  // TODO 7: Validación de vendedor
  if (!vendor) {
    displayError("vendorError", "Vendor name is required.");
    isValid = false;
  }

  // TODO 8: Validación de correo electrónico
  if (!email || !email.includes("@")) {
    displayError("emailError", "Please enter a valid email.");
    isValid = false;
  }

  // TODO 9: Validación de teléfono de 10 dígitos
  const phoneRegex = /^[0-9]{10}$/;

  if (!phoneNumber || !phoneRegex.test(phoneNumber)) {
    displayError(
      "phoneNumberError",
      "Phone number is required and should be of 10 digits.",
    );
    isValid = false;
  }

  if (isValid) {
    document.getElementById("productForm").style.display = "none";
    document.getElementById("thanksMessage").style.display = "block";
  }
}

function displayError(elementId, message) {
  document.getElementById(elementId).innerHTML = message;
}

function clearErrors() {
  const errorElements = document.querySelectorAll(".error-message");

  errorElements.forEach(function (errorElement) {
    errorElement.innerHTML = "";
  });
}
