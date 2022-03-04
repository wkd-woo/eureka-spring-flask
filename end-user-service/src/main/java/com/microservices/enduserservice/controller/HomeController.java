package com.microservices.enduserservice.controller;

import com.microservices.enduserservice.entity.GradesResult;
import com.microservices.enduserservice.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HomeController {

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/student")
    public ResponseEntity<String> student(@RequestBody Student student) {
        GradesResult gradesResult = restTemplate.getForObject("http://data-aggregation-service/calculateGrades", GradesResult.class);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(String.format("Sent the Student to the Data Aggregation Service %s \nAnd got back:\n %s",
                        student.toString(), gradesResult.toString()));
    }
}
