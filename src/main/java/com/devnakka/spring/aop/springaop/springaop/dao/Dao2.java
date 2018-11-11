package com.devnakka.spring.aop.springaop.springaop.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Srikanth Nakka on 11/8/2018
 * @project spring-aop
 */

@Repository
public class Dao2 {

    public String retriveSomething() throws Exception {

        return "DAO2";
    }
}
