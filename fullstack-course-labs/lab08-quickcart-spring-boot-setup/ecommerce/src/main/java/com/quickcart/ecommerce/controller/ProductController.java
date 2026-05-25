package com.quickcart.ecommerce.controller;

import com.quickcart.ecommerce.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping({ "/", "/products" })
    public String getProducts(Model productModel) {

        List<Product> products = new ArrayList<>();

        Product laptop = new Product(
                1,
                "Laptop",
                "Una laptop para trabajo, estudio y entretenimiento.",
                500.0);

        Product smartphone = new Product(
                2,
                "Smartphone",
                "Un teléfono inteligente para comunicación y uso diario.",
                350.0);

        Product headphones = new Product(
                3,
                "Headphones",
                "Auriculares para escuchar música, llamadas y reuniones.",
                80.0);

        products.add(laptop);
        products.add(smartphone);
        products.add(headphones);

        productModel.addAttribute("products", products);

        return "products";
    }
}