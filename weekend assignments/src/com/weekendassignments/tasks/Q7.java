package com.weekendassignments.tasks;
    public class Q7 {
        public static void main(String[] args) {
            char ch = 'a'; // Change this to test different characters

            char newChar;
            if (Character.isUpperCase(ch)) {
                newChar = Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                newChar = Character.toUpperCase(ch);
            } else {
                System.out.println("Invalid character.");
                return;
            }

            System.out.println( newChar);
        }
    }
