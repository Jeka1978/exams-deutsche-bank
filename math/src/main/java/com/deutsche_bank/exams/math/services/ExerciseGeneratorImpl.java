package com.deutsche_bank.exams.math.services;

import com.deutsche_bank.exams.math.model.Exercise;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Service
public class ExerciseGeneratorImpl implements ExerciseGenerator {
    private Random random = new Random();
    @Value("${max}")
    private int max;
    @Override
    public Exercise generate() {
        int a = random.nextInt(max);
        int b = random.nextInt(max);
        return Exercise.builder().question(a+" + "+b+" = ").answer(String.valueOf(a+b)).build();
    }
}
