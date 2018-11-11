package com.devnakka.spring.aop.springaop.springaop.business;

import com.devnakka.spring.aop.springaop.springaop.TimeTaken;
import com.devnakka.spring.aop.springaop.springaop.dao.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Srikanth Nakka on 11/8/2018
 * @project spring-aop
 */

@Service
public class Business1 {


    @Autowired
    private Dao1 dao1;

    @TimeTaken
    public String calculateSomething(){
        return dao1.retriveSomething();
    }
}
