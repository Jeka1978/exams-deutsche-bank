package com.deutsche_bank.exams.java.services;

import com.deutsche_bank.exams.java.model.Exercise;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface ExerciseGenerator {

    List<Exercise> generate(int amount);
}
