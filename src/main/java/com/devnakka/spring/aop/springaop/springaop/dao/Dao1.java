package com.devnakka.spring.aop.springaop.springaop.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Srikanth Nakka on 11/8/2018
 * @project spring-aop
 */

@Repository
public class Dao1 {

    public String retriveSomething(){
        return "DAO1";
    }
}
