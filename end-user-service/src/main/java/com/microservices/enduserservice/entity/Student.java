package com.microservices.enduserservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = PROTECTED)
public class Student {
    private String name;
    private double mathGrade;
    private double englishGrade;
    private double historyGrade;
    private double scienceGrade;

}
