package com.github.karenpp.learned_words_manager_api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Vocabulary extends KeyWords {
    @OneToMany(
            mappedBy = "vocabulary",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Example> examples = new ArrayList<>();
}
