package com.logicworkusa.qa.ch04variabletypes;
import java.util.Arrays;

public class Test10ArrayVariable {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 28, 16, 43};
        Arrays.sort(numbers);
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));
        System.out.println("Sum of Numbers: " + sum);
    }
}
