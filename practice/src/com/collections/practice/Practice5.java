package com.collections.practice;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Practice5 {
    public static void main(String[] args) {
       PriorityQueue<Integer> mydata=new PriorityQueue<>(Comparator.reverseOrder());
        mydata.add(5);
        mydata.add(2);
        mydata.add(3);
        mydata.add(1);
        mydata.add(6);
        mydata.add(6);
        System.out.println(mydata);
//
//        System.out.println(mydata);
//        System.out.println(mydata.poll());
//        for (int i = 1; i < 6; i++) {
//            System.out.println(i);

        }

    }

