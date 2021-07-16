package com.github.karenpp.learned_words_manager_api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ExampleDto extends AuditableDto {
    private long id;
    private String content;
    private String translation;
}
