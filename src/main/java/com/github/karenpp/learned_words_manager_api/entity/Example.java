package com.github.karenpp.learned_words_manager_api.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Example extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Setter(AccessLevel.PROTECTED)
    private long id;

    private String content;
    private String translation;

    @ManyToOne
    @JoinColumn(name = "expression_id")
    private Expression expression;

    @ManyToOne
    @JoinColumn(name = "verb_id")
    private Verb verb;

    @ManyToOne
    @JoinColumn(name = "vocabulary_id")
    private Vocabulary vocabulary;



}
