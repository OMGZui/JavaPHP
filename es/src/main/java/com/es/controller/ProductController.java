package com.es.controller;

import com.es.model.Product;
import com.es.repository.ProductRepository;
import com.es.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/es/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;


    @Autowired
    private ProductService productService;

    @GetMapping("list")
    public List<Product> list() {
        return productRepository.findByTitle("杭州");
    }
}
