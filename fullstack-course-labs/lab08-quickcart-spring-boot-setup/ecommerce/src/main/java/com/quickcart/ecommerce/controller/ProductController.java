package com.quickcart.ecommerce.controller;

import com.quickcart.ecommerce.model.Product;
import com.quickcart.ecommerce.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

        private final ProductService productService;

        public ProductController(ProductService productService) {
                this.productService = productService;
        }

        @GetMapping({ "/", "/products" })
        public String listProducts(Model model) {
                model.addAttribute("products", productService.getAllProducts());
                return "products";
        }

        @GetMapping("/add")
        public String showAddProductForm(Model model) {
                model.addAttribute("product", new Product());
                return "add-new-product";
        }

        @PostMapping("/saveProduct")
        public String saveProduct(Product product) {
                productService.saveProduct(product);
                return "redirect:/";
        }

        @GetMapping("/showFormForUpdate/{id}")
        public String showFormForUpdate(@PathVariable Integer id, Model model) {
                Product product = productService.getProductById(id);
                model.addAttribute("product", product);
                return "update-product";
        }

        @GetMapping("/deleteProduct/{id}")
        public String deleteProduct(@PathVariable Integer id) {
                productService.deleteProductById(id);
                return "redirect:/";
        }
}