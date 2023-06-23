package com.weekendassignments.tasks;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num= scanner.nextInt();
        int ans=0;
        while (num>0){
            int rem=num%10;
            num/=10;

            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}
