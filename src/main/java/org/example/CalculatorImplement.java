package org.example;

public class CalculatorImplement implements Calculator {

    @Override
    public Integer sum(int numA, int numB) {
        return numA + numB;
    }

    @Override
    public Integer sub(int numA, int numB) {
        return numA - numB;
    }

}
