package com.recrutTask;

import java.util.ArrayList;
import java.util.List;

public class AlertEngine {
    public static List<String> process(List<Integer> numbers){
        List<String> processedData = new ArrayList<>();
        for(var num : numbers){
            if(num%15==0){
                processedData.add("LOWADVISORY");
            }else if(num%3==0){
                processedData.add("LOW");
            }else if(num%5==0){
                processedData.add("ADVISORY");
            }else{
                processedData.add(num.toString());
            }
        }
        return processedData;
    }
}
