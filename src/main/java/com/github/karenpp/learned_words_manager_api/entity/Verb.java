package com.github.karenpp.learned_words_manager_api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Verb extends KeyWords {
    @OneToMany(
            mappedBy = "verb",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Example> examples = new ArrayList<>();
    private String infinitive;
    private String pastSimple;
    private String pastParticiple;
}
