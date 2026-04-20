package com.recrutTask;

import java.util.List;
import java.util.stream.Collectors;

public class AlertEngine {
    public static List<String> process(List<Integer> numbers, List<Rule> rules){
        return numbers.stream().map(num ->{
            String result = rules.stream()
                    .filter(r -> r.matches(num))
                    .map(Rule::output)
                    .collect(Collectors.joining());
            return result.isEmpty() ? num.toString() : result;
        })
       .toList();
    }
}
