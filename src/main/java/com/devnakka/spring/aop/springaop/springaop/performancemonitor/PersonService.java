package com.devnakka.spring.aop.springaop.springaop.performancemonitor;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;


public class PersonService {

    public String getFullName(Person person){
        return person.getLastName()+" "+person.getFirstName();
    }
    
    public int getAge(Person person){
        Period p = Period.between(person.getDateOfBirth(), LocalDate.now());
        return p.getYears();
    }
    
}
