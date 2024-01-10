package com.logicworkusa.qa.ch04variabletypes;
public class Test03ShortVariableObject {
    public static void main(String[] args) {
    	Short population = 15000;
        Short countryCount = 195;
        Short averagePopulation = (short) (population / countryCount);

        System.out.println("Total Population: " + population);
        System.out.println("Number of Countries: " + countryCount);
        System.out.println("Average Population per Country: " + averagePopulation);
    }
}
