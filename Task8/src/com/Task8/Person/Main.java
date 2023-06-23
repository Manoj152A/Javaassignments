package com.Task8.Person;

public class Main {
    public static void main(String[] args) {
        Person[]persons =new Person[2];
        persons[0]=new Student();
        persons[1]=new Teacher();
        for (Person person:persons){
            String greet=person.greet();
            System.out.println(greet);


        };

        }
    }

