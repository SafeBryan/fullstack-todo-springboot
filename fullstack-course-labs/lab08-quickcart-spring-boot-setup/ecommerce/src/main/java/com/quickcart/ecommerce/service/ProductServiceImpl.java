package com.quickcart.ecommerce.service;

import com.quickcart.ecommerce.model.Product;
import com.quickcart.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product getProductById(Integer id) {
        Optional<Product> optional = productRepository.findById(id);

        if (optional.isPresent()) {
            return optional.get();
        }

        throw new RuntimeException("Producto no encontrado con id: " + id);
    }

    @Override
    public void deleteProductById(Integer id) {
        productRepository.deleteById(id);
    }
}