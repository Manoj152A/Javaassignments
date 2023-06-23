package com.collections.practice;

import java.util.HashSet;

public class Practice3 {
    public static void main(String[] args) {
        HashSet<String> mydata=new HashSet<>();
        mydata.add("Manoj");
        mydata.add("Siva");
        mydata.add("vikas");
        mydata.add("Rahul");
        mydata.add("vikas");
        mydata.add("vikas");

        mydata.add(null);
        System.out.println(mydata.size());
//        System.out.println(mydata.contains("Rahul"));
//        System.out.println(mydata.remove("Siva"));
        for (String m:mydata)
              {
                  System.out.println(m);

        }

    }
}
