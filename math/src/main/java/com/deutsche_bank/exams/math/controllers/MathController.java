package com.deutsche_bank.exams.math.controllers;

import com.deutsche_bank.exams.math.model.Exercise;
import com.deutsche_bank.exams.math.services.ExerciseGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequiredArgsConstructor
public class MathController {
    private final ExerciseGenerator generator;

    @GetMapping("/math")
    public List<Exercise> getExercises(@RequestParam("amount") int amount) {
       return IntStream.range(0, amount).mapToObj(__ -> generator.generate()).collect(toList());
    }
}
