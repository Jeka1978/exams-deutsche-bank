package com.deutsche_bank.exams.java.controllers;

import com.deutsche_bank.exams.java.model.Exercise;
import com.deutsche_bank.exams.java.services.ExerciseGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequiredArgsConstructor
public class JavaExerciseController {
    private final ExerciseGenerator generator;

    @GetMapping("/java")
    public List<Exercise> getExercises(@RequestParam("amount") int amount) {
        return generator.generate(amount);
    }
}
