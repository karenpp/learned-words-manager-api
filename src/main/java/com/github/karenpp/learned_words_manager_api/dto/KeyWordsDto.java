package com.github.karenpp.learned_words_manager_api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public abstract class KeyWordsDto extends AuditableDto {
    private long id;
    private String classification;
    private String type;
    private String whereItWasFound;
    private String translation;
    private String definition;
}
