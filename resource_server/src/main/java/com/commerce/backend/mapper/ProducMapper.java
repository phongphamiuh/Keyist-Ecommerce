package com.commerce.backend.mapper;

import com.commerce.backend.model.entity.Product;
import com.commerce.backend.model.response.product.TelevisionResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ProducMapper {

    @Mapping(target = "id",source = "product.id")
    @Mapping(target = "name",source = "product.productType.name")
    public abstract TelevisionResponse mapToDto(Product product);


//    private double onSalePrice;
//    private String brand;
//    private String type;
//    private String size;
//    private String resolution;
//    private String source;
//    private String description;
}
