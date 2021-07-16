package com.github.karenpp.learned_words_manager_api.dto;

import lombok.Data;

import java.util.Date;

@Data
public abstract class AuditableDto {
    private Date createdAt;
    private Date lastModifiedAt;
}
