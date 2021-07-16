package com.github.karenpp.learned_words_manager_api.controller;

import com.github.karenpp.learned_words_manager_api.dto.VerbDto;
import com.github.karenpp.learned_words_manager_api.entity.Verb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/verb")
public class VerbController {

    @Autowired
    private VerbConverter verbConverter;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public VerbDto getVerb(Long id) {
        Verb verb = new Verb();
        verb.setExamples(new ArrayList<>());

        return verbConverter.toDto(new VerbDto(), verb);
        //return "oi";
    }

}
