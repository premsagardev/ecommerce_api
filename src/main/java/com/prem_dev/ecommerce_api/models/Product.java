package com.prem_dev.ecommerce_api.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product_inventory")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "product_name", nullable = false)
    private String product_name;
    @Column(name = "color")
    private String color;
    @Column(name = "price")
    private int price;
}
