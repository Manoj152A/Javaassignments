package com.weekendassignments.tasks;

public class Q15 {
    public static void main(String[] args) {
        int number = 12345; // Change this to your desired number
        int sum = 0;

        String numberString = String.valueOf(number);

        for (int i = 0; i < numberString.length(); i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            sum += digit;
        }

        System.out.println("Sum of digits in " + number + " = " + sum);
    }
}
