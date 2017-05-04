package com.store.beans;

import static com.store.commons.mapper.ObjectMapper.PRODUCT_ENTITY;
import com.store.domain.ProductDto;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    public List<ProductDto> findAll() {
        return productRepo.findAll().stream()
                .map(entity -> PRODUCT_ENTITY.convert(entity)).
                collect(Collectors.toList());
    }

}
