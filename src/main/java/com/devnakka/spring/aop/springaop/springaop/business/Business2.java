package com.devnakka.spring.aop.springaop.springaop.business;

import com.devnakka.spring.aop.springaop.springaop.dao.Dao1;
import com.devnakka.spring.aop.springaop.springaop.dao.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Srikanth Nakka on 11/8/2018
 * @project spring-aop
 */

@Service
public class Business2 {


    @Autowired
    private Dao2 dao2;

    public String calculateSomething() {
        try {
            return dao2.retriveSomething();
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return null;
    }


}
