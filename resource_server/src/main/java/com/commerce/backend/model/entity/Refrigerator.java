package com.commerce.backend.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="refrigerator")
@Data
@NoArgsConstructor
public class Refrigerator extends ProductType{
    private String sku;
    private int stockTotal;
    private double price;
    private double onSalePrice;
    private String brand;
    private String type;
    private String size;
    private int doorNumber;
    private boolean inverter;
    private String source;
    private String description;

    public Refrigerator(String name, String sku, int stockTotal, double price, double onSalePrice, String brand, String type, String size, int doorNumber, boolean inverter, String source, String description) {
        super(name);
        this.sku = sku;
        this.stockTotal = stockTotal;
        this.price = price;
        this.onSalePrice = onSalePrice;
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.doorNumber = doorNumber;
        this.inverter = inverter;
        this.source = source;
        this.description = description;
    }
}
