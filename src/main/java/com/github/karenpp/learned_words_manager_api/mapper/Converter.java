package com.github.karenpp.learned_words_manager_api.mapper;

import org.springframework.stereotype.Service;

public interface Converter<Entity, Dto> {

    void toDto(Dto dto, Entity entity);

    void toEntity(Dto dto, Entity entity);

}
