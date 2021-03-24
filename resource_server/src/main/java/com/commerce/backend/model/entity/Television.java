package com.commerce.backend.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="televistion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Television extends ProductType{
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
