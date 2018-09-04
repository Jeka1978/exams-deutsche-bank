package com.deutsche_bank.exams.examinator.model;

import lombok.*;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Section {
    private String name;
    @Singular
    private List<Exercise> exercises;
}
