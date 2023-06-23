package com.weekendassignments.tasks;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number");
        int number= scanner.nextInt(); // give a number to check if its a prime number

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = true;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}


