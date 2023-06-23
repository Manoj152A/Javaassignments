package com.weekendassignments.tasks;

public class Mumbai {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Mumbai Banglore");
        } else {
            System.out.println(String.join("value", args));
        }
    }
}
