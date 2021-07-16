package com.github.karenpp.learned_words_manager_api.repository;

import com.github.karenpp.learned_words_manager_api.entity.Verb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerbRepository extends CrudRepository<Verb, Long> {
}
