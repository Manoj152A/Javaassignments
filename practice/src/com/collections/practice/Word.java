package com.collections.practice;

/*Given a paragraph of text, count the frequency of each word and
print the result in
descending order of frequency, using a Map implementation.*/

import java.util.HashMap;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        String paragaraph="The cat and the dog played together. The cat chased the mouse.";
        HashMap<String,Integer>mydata=new HashMap<>();
        mydata.put("The",3);
        mydata.put("cat",2);
        mydata.put("chased",1);
        mydata.put("and",1);
        mydata.put("dog",1);
        mydata.put("played",1);
        mydata.put("together",1);
        mydata.put("mouse",1);


    }

}
