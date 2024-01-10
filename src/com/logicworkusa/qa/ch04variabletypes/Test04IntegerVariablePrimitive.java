package com.logicworkusa.qa.ch04variabletypes;
public class Test04IntegerVariablePrimitive {
    public static void main(String[] args) {
        int population = 1500000000;
        int countryCount = 195;
        int averagePopulation = population / countryCount;

        System.out.println("Total Population: " + population);
        System.out.println("Number of Countries: " + countryCount);
        System.out.println("Average Population per Country: " + averagePopulation);
    }
}
