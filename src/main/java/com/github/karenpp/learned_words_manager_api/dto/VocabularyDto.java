package com.github.karenpp.learned_words_manager_api.dto;

import com.github.karenpp.learned_words_manager_api.entity.Example;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class VocabularyDto extends KeyWordsDto {
    private List<Example> examples = new ArrayList<>();
}
