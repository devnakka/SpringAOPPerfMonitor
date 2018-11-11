package com.devnakka.spring.aop.springaop.springaop;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Srikanth Nakka on 11/9/2018
 * @project spring-aop
 */
public class MapEqualsChallenge {

    public static void main(String[] args) {

        Map<Stark, String> map = new LinkedHashMap<>();

        map.put(new Stark("Arya"),"1"); map.put(new Stark("Ned"),"2");
        map.put(new Stark("Sansa"),"3"); map.put(new Stark("Bran"),"4");
        map.put(new Stark("Jaime"),"5");

        map.forEach((k,v) -> System.out.println(v));
    }

    static class Stark{
        String name;

        public Stark(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            return ((Stark)obj).name.length() == this.name.length();
        }

        @Override
        public int hashCode() {
            return 4000 << 2 * 2000 / 10000;
        }
    }
}
