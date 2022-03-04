package com.microservices.enduserservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

import static lombok.AccessLevel.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = PROTECTED)
public class GradesResult {

    private Map<String, Double> mathGrade;
    private Map<String, Double> englishGrade;
    private Map<String, Double> historyGrade;
    private Map<String, Double> scienceGrade;

}
