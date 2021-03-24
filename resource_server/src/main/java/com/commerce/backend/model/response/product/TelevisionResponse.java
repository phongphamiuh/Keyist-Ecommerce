package com.commerce.backend.model.response.product;

import lombok.Data;

@Data
public class TelevisionResponse {
    private Long id;
    private String name;
    private String sku;
    private int stockTotal;
    private double price;
    private double onSalePrice;
    private String brand;
    private String type;
    private String size;
    private String resolution;
    private String source;
    private String description;
}
