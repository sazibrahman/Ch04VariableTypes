package com.logicworkusa.qa.ch04variabletypes;
public class Test01BooleanVariableObject {
    public static void main(String[] args) {
        Boolean isRaining = true;
        Boolean isSunny = false;
        Boolean isWeatherFine = !isRaining && isSunny;

        System.out.println("Is it Raining? " + isRaining);
        System.out.println("Is it Sunny? " + isSunny);
        System.out.println("Is the Weather Fine? " + isWeatherFine);
    }
}
