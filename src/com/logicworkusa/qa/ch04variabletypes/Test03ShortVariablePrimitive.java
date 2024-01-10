package com.logicworkusa.qa.ch04variabletypes;
public class Test03ShortVariablePrimitive {
    public static void main(String[] args) {
        short population = 15000;
        short countryCount = 195;
        short averagePopulation = (short) (population / countryCount);

        System.out.println("Total Population: " + population);
        System.out.println("Number of Countries: " + countryCount);
        System.out.println("Average Population per Country: " + averagePopulation);
    }
}
