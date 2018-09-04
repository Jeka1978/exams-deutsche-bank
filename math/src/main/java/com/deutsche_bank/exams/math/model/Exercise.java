package com.deutsche_bank.exams.math.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Exercise {
    private String question;
    private String answer;

}
