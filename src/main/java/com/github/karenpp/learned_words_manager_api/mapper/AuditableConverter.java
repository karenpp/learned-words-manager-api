package com.github.karenpp.learned_words_manager_api.mapper;

import com.github.karenpp.learned_words_manager_api.dto.AuditableDto;
import com.github.karenpp.learned_words_manager_api.entity.Auditable;
import org.springframework.stereotype.Service;

@Service
public class AuditableConverter implements Converter<Auditable, AuditableDto> {

    @Override
    public void toDto(AuditableDto auditableDto, Auditable auditable) {
        auditableDto.setCreatedAt(auditable.getCreatedAt());
        auditableDto.setLastModifiedAt(auditable.getLastModifiedAt());
    }

    @Override
    public void toEntity(AuditableDto auditableDto, Auditable auditable) {
        auditable.setCreatedAt(auditableDto.getCreatedAt());
        auditable.setLastModifiedAt(auditableDto.getLastModifiedAt());
    }
}
