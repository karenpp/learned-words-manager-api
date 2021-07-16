package com.github.karenpp.learned_words_manager_api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class KeyWords extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //regular verb, irregular verb, adverb,adjective,noun,pronoun
    private String classification;
    //Verb, expression or vocabulary
    private String type;
    private String whereItWasFound;
    private String translation;
    private String definition;
}
