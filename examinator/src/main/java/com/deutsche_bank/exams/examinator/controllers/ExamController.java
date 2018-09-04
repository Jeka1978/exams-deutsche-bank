package com.deutsche_bank.exams.examinator.controllers;

import com.deutsche_bank.exams.examinator.model.Exam;
import com.deutsche_bank.exams.examinator.model.Exercise;
import com.deutsche_bank.exams.examinator.model.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

/**
 * @author Evgeny Borisov
 */
@RestController
public class ExamController {




    @Autowired
    private RestTemplate restTemplate;



    @PostMapping("/exam")
    public Exam getExam(@RequestBody Map<String, Integer> examRequest) {
        List<Section> sections = examRequest.entrySet().stream().map(entry -> {
            String microserviceName = entry.getKey();
            String url = "http://" + microserviceName + "/"+microserviceName+"?amount=" + entry.getValue();

            Exercise[] exercises = restTemplate.getForObject(url, Exercise[].class);
            return Section.builder().exercises(asList(exercises)).name(microserviceName).build();
        }).collect(toList());

        return new Exam("super exam", sections);

    }
}








