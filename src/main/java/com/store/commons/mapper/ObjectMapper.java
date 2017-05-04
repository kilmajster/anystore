package com.store.commons.mapper;

import com.store.domain.ProductDto;
import com.store.domain.ProductEntity;

public class ObjectMapper {

    public static final EntityMapper<ProductEntity, ProductDto> PRODUCT_ENTITY = entity -> {
        ProductDto dto = new ProductDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        dto.setPrice(entity.getPrice());
        dto.setAmount(entity.getAmount());
        return dto;
    };

    public static final DtoMapper<ProductDto, ProductEntity> PRODUCT_DTO = dto -> {
        ProductEntity entity = new ProductEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        entity.setAmount(dto.getAmount());
        return entity;
    };
}
