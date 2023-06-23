package com.weekendassignments.tasks;

import java.util.Scanner;

public class Q13 {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("please enter the Start number");
            int startNumber =scanner.nextInt() ;
            System.out.println("please enter the Last number ");
            int endNumber =scanner.nextInt();

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

