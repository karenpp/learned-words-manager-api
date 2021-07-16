package com.github.karenpp.learned_words_manager_api.mapper;

import com.github.karenpp.learned_words_manager_api.dto.ExampleDto;
import com.github.karenpp.learned_words_manager_api.entity.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleConverter implements Converter<Example, ExampleDto> {

    @Autowired
    private AuditableConverter auditableConverter;

    @Override
    public void toDto(ExampleDto exampleDto, Example example) {
        exampleDto.setId(example.getId());
        exampleDto.setContent(example.getContent());
        exampleDto.setTranslation(example.getTranslation());
        auditableConverter.toDto(exampleDto, example);
    }

    @Override
    public void toEntity(ExampleDto exampleDto, Example example) {
        example.setId(exampleDto.getId());
        example.setContent(exampleDto.getContent());
        example.setTranslation(exampleDto.getTranslation());
        auditableConverter.toEntity(exampleDto, example);
    }
}
