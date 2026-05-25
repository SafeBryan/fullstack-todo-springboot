package com.example.shoppinglist.service;

import com.example.shoppinglist.model.Product;
import com.example.shoppinglist.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Obtener todos los productos
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Obtener producto por ID
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    // Agregar nuevo producto
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Actualizar producto existente
    public Product updateProduct(Long id, Product productDetails) {
        Product updatingProduct = productRepository.findById(id).orElse(null);

        if (updatingProduct == null) {
            return null;
        }

        updatingProduct.setProductName(productDetails.getProductName());
        updatingProduct.setPrice(productDetails.getPrice());
        updatingProduct.setDescription(productDetails.getDescription());

        return productRepository.save(updatingProduct);
    }

    // Eliminar producto por ID
    public String deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return "Product deleted with id " + id;
        }

        return "Product not found with id " + id;
    }
}