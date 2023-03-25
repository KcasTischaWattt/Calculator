package org.example;

public class Calculator {

    public void turnOn() {
        System.out.println("Starting...");
    }

    public void turnOff() {
        System.out.println("Shutting down...");
    }

    public int add(int a, int b) {
        return a + b;
    }

    // Представим, что я ошибся в этом методе
    public int mod(int a, int b) {
        return a / b;
    }
}
