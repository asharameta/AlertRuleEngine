package com.recrutTask;

public class AlertRule implements Rule{
    private final int divisor;
    private final String word;

    public AlertRule(int divisor, String word){
        this.divisor = divisor;
        this.word = word;
    }

    @Override
    public boolean matches(int n) {
        return n%divisor == 0;
    }

    @Override
    public String output() {
        return word;
    }
}
