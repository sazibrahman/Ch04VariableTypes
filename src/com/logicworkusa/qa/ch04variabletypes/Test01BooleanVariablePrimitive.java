package com.logicworkusa.qa.ch04variabletypes;
public class Test01BooleanVariablePrimitive {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isSunny = false;
        boolean isWeatherFine = !isRaining && isSunny;

        System.out.println("Is it Raining? " + isRaining);
        System.out.println("Is it Sunny? " + isSunny);
        System.out.println("Is the Weather Fine? " + isWeatherFine);
    }
}
