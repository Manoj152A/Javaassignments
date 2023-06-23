package com.weekendassignments.tasks;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the month in number");
        int month =scanner.nextInt();
                switch (month){
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("august");
            case 10:
                System.out.println("october");
                break;
            case 9:
                System.out.println("september");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("invalid month");
        }
    }
}
