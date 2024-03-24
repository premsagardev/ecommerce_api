package com.prem_dev.ecommerce_api.services;

import com.prem_dev.ecommerce_api.controllers.ProductController;
import com.prem_dev.ecommerce_api.models.Product;
import com.prem_dev.ecommerce_api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public Product getProduct(long productId){
        return productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Data Not found"));
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product updateProduct(Product product, long productId){
        Product existingProduct = productRepository.findById(productId).orElseThrow(()-> new RuntimeException("Does not Exist"));
        existingProduct.setProduct_name(product.getProduct_name());
        existingProduct.setColor(product.getColor());
        existingProduct.setPrice((product.getPrice()));
        productRepository.save(existingProduct);
        return existingProduct;
    }

    public Product deleteProduct(long productId){
        Product existingProduct = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Does not Exist"));
        productRepository.deleteById(productId);
        return existingProduct;
    }

    public List<Product> getProductByName(String productName){
        return productRepository.getByName(productName);
    }
}
