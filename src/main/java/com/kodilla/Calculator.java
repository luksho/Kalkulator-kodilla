package com.kodilla;

public class Calculator {
    int value1;
    int value2;

    public Calculator(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void aAddB(){
        System.out.println(value1+value2);
    }
    public void aSubstractB(){
        System.out.println(value1-value2);
    }
}

