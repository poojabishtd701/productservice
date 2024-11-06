package com.example.product.controller;

import com.example.product.dtos.ProductRequestDto;
import com.example.product.models.Product;
import com.example.product.service.IProductService;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService  productService;
    //get all products

    @GetMapping("/products")
    public List<Product> getProducts() {
      return    List.of();

    }
    //Get product with id
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") Long id) {
        return productService.getSingleProduct(id);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody ProductRequestDto  productRequestDto) {
        return new Product();
    }

  @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable("id") Long id,@RequestBody ProductRequestDto  productRequestDto) {
        return new Product();
  }

  @DeleteMapping("/products/{id}")
    public boolean deleteProduct(@PathVariable("id") Long id) {
        return true;
  }

}
