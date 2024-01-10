package com.logicworkusa.qa.ch04variabletypes;
public class Test04IntegerVariableObject {
    public static void main(String[] args) {
        Integer population = 1500000000;
        Integer countryCount = 195;
        Integer averagePopulation = population / countryCount;

        System.out.println("Total Population: " + population);
        System.out.println("Number of Countries: " + countryCount);
        System.out.println("Average Population per Country: " + averagePopulation);
    }
}
