package com.commerce.backend.mapper;

import com.commerce.backend.model.entity.Television;
import com.commerce.backend.model.response.product.TelevisionResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class TelevisionMapper {
    public abstract TelevisionResponse mapToDto(Television television);
}
