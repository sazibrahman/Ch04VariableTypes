package com.logicworkusa.qa.ch04variabletypes;
public class Test08CharVariableObject {
    public static void main(String[] args) {
        Character firstLetter = 'J';
        Character lastLetter = 'Z';
        int distance = lastLetter - firstLetter;

        System.out.println("First Letter: " + firstLetter);
        System.out.println("Last Letter: " + lastLetter);
        System.out.println("Distance between Letters: " + distance);
    }
}
