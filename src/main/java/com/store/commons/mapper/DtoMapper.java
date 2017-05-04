package com.store.commons.mapper;

import com.store.commons.BaseDto;
import com.store.commons.BaseEntity;

@FunctionalInterface
public interface DtoMapper<D extends BaseDto, E extends BaseEntity>{
    E convert(D dto);
}
