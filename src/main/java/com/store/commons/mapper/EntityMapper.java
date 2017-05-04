package com.store.commons.mapper;

import com.store.commons.BaseDto;
import com.store.commons.BaseEntity;

@FunctionalInterface
public interface EntityMapper<E extends BaseEntity, D extends BaseDto> {
    D convert(E entity);
}
