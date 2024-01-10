package com.logicworkusa.qa.ch04variabletypes;
public class Test06FloatVariableObject {
    public static void main(String[] args) {
        Float pi = 3.14159265359F;
        Float radius = 5.6F;
        Float area = pi * radius * radius;

        System.out.println("Value of Pi: " + pi);
        System.out.println("Radius of Circle: " + radius);
        System.out.println("Area of Circle: " + area);
    }
}
