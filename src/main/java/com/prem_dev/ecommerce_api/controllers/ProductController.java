package com.prem_dev.ecommerce_api.controllers;

import com.prem_dev.ecommerce_api.models.Product;
import com.prem_dev.ecommerce_api.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    // we will be writing the Crud operations here


    // insert a product into our database
    @PostMapping("/product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        Product savedProduct = productService.saveProduct(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }
    // Get a product from out database
    @GetMapping("/product")
    public ResponseEntity<Product> getProduct(@RequestParam(name = "productID") long productId){
        Product product = productService.getProduct(productId);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    // Get all products from the database
    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    // Update a product in the db
    @PatchMapping("/product")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product,@RequestParam(name = "productID") long productID){
        Product updateProduct = productService.updateProduct(product, productID);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    // Delete a product from the db
    @DeleteMapping("/product")
    public ResponseEntity<Product> deleteProduct(long productId){
        Product deletedProduct = productService.deleteProduct(productId);
        return new ResponseEntity<>(deletedProduct, HttpStatus.OK);
    }
    // Get product by name using custom SQL
    @GetMapping("/products-by-name")
    public List<Product> getProductByName(@RequestParam(name = "productName") String productName){
        return productService.getProductByName(productName);
    }
}
