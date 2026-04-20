package com.recrutTask;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        List<Rule> rules = List.of(
          new AlertRule(3, "LOW"),
          new AlertRule(5, "ADVISORY")
        );

        System.out.println(AlertEngine.process(numbers, rules));
    }
}