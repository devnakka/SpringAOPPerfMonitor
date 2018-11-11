package com.devnakka.spring.aop.springaop.springaop;

import com.devnakka.spring.aop.springaop.springaop.performancemonitor.Person;
import com.devnakka.spring.aop.springaop.springaop.performancemonitor.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PerfomanceApp implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PersonService personService;

    @Autowired
    private Person person;

    public static void main(String[] args) {

        SpringApplication.run(PerfomanceApp.class, args);

        /*ApplicationContext context = new AnnotationConfigApplicationContext(AopConfiguration.class);
        Person person = (Person) context.getBean("person");
        PersonService personService = (PersonService) context.getBean("personService");
        
        System.out.println("Name is:"+personService.getFullName(person));
        System.out.println("Age is:"+personService.getAge(person));*/
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Name is:"+ personService.getFullName(person));
        logger.info("Age is:"+ personService.getAge(person));
    }
}
