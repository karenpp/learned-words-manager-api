package com.github.karenpp.learned_words_manager_api.mapper;

import com.github.karenpp.learned_words_manager_api.dto.KeyWordsDto;
import com.github.karenpp.learned_words_manager_api.entity.KeyWords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeyWordsConverter implements Converter<KeyWords, KeyWordsDto> {

    @Autowired
    private AuditableConverter auditableConverter;

    @Override
    public void toDto(KeyWordsDto keyWordsDto, KeyWords keyWords) {
        keyWordsDto.setId(keyWords.getId());
        keyWordsDto.setClassification(keyWords.getClassification());
        keyWordsDto.setDefinition(keyWords.getDefinition());
        keyWordsDto.setTranslation(keyWords.getTranslation());
        keyWordsDto.setType(keyWords.getType());
        keyWordsDto.setWhereItWasFound(keyWords.getWhereItWasFound());
        auditableConverter.toDto(keyWordsDto, keyWords);
    }

    @Override
    public void toEntity(KeyWordsDto keyWordsDto, KeyWords keyWords) {
        keyWords.setId(keyWordsDto.getId());
        keyWords.setClassification(keyWordsDto.getClassification());
        keyWords.setDefinition(keyWordsDto.getDefinition());
        keyWords.setTranslation(keyWordsDto.getTranslation());
        keyWords.setType(keyWordsDto.getType());
        keyWords.setWhereItWasFound(keyWordsDto.getWhereItWasFound());
        auditableConverter.toDto(keyWordsDto, keyWords);
    }
}
