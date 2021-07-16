package com.github.karenpp.learned_words_manager_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LearnedWordsManagerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnedWordsManagerApiApplication.class, args);
	}

}
