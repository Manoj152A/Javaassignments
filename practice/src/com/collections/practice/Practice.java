package com.collections.practice;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<String> al1=new ArrayList<>();
        al1.add("Manoj");
        al1.add("Siva");
        al1.add("Rahul");
        al1.add("vikas");
        al1.add(null);

//        System.out.println(al1.contains("Siva"));
//        System.out.println(al1.remove("vikas"));
        for (int i = 0; i< al1.size(); i++) {
            System.out.println(al1.get(i));

        }

        }


    }

