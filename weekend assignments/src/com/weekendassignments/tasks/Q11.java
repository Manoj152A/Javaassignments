package com.weekendassignments.tasks;

public class Q11 {
    public static void main(String[] args) {
        int startNumber = 23;
        int endNumber = 57;

        for (int number = startNumber; number <= endNumber; number++) {
            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= number / 2; i++) {
                    // condition for non-prime number
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            }
        }
    }
}
