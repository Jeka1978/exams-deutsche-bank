package com.deutsche_bank.exams.examinator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exam {
    private String title;
    private List<Section> sections;
}
