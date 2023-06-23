package com.weekendassignments.tasks;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age ");
        int Age = scanner.nextInt();
        System.out.println("please enter your gender ");
        String gender = scanner.next();
        String Female;
        String Male;


        if (gender.equalsIgnoreCase("Female")) {
            if (Age >= 1 && Age <= 58) {
                System.out.println("The intrest is 8.2%");
            } else if (Age >= 59 && Age <= 120) {
                System.out.println("The intrest is 7.6%");
            } else {
                System.out.println("Invalid");
            }

        }else if ("Male".equalsIgnoreCase(gender)) {
                if (Age >= 1 && Age <= 60) {
                    System.out.println("The intrest is 9.2%");
                } else if (Age >= 61 && Age <= 120) {
                    System.out.println("The intrest is 8.3%");
                }else {
                    System.out.println("Invalid");
                }
                scanner.close();
            }

        }
    }

