package com.deutsche_bank.exams.java.services;

import com.deutsche_bank.exams.java.model.Exercise;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * @author Evgeny Borisov
 */
@Service
public class ExerciseGeneratorImpl implements ExerciseGenerator {

    private List<Exercise> exercises = new ArrayList<>();
   @PostConstruct
   private void init(){
       exercises.add(Exercise.builder().question("what is java version?").answer( "10").build());
       exercises.add(Exercise.builder().question("what is maven last version?").answer("3.5.9").build());
       exercises.add(Exercise.builder().question("what is groovy last version?").answer("2+").build());
       exercises.add(Exercise.builder().question("what difference between spring string and swing").answer(":)").build());
   }


    @Override
    public List<Exercise> generate(int amount) {
        Collections.shuffle(exercises);
        return exercises.subList(0, amount);
    }
}



