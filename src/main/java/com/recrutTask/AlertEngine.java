package com.recrutTask;

import java.util.ArrayList;
import java.util.List;

public class AlertEngine {
    public static List<String> process(List<Integer> numbers){
        List<String> processedData = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for(var num : numbers){
            builder.setLength(0);
            if(num%3==0){
                builder.append("LOW");
            }
            if(num%5==0){
                builder.append("ADVISORY");
            }
            processedData.add(builder.isEmpty() ? num.toString() : builder.toString());
        }
        return processedData;
    }
}
