package com.weekendassignments.tasks;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        floydsTriangle(8);
        }
    static void floydsTriangle(int n) {
        for (int row = 2; row<=n; row++) {
            for (int col = 2; col <=row; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }


    }}