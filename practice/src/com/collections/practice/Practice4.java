package com.collections.practice;

import java.security.Key;
import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class Practice4 {
    public static void main(String[] args) {
      ConcurrentMap<String,Character>mydata=new ConcurrentMap<String, Character>() {
          @Override
          public Character putIfAbsent(String key, Character value) {
              return null;
          }

          @Override
          public boolean remove(Object key, Object value) {
              return false;
          }

          @Override
          public boolean replace(String key, Character oldValue, Character newValue) {
              return false;
          }

          @Override
          public Character replace(String key, Character value) {
              return null;
          }

          @Override
          public int size() {
              return 0;
          }

          @Override
          public boolean isEmpty() {
              return false;
          }

          @Override
          public boolean containsKey(Object key) {
              return false;
          }

          @Override
          public boolean containsValue(Object value) {
              return false;
          }

          @Override
          public Character get(Object key) {
              return null;
          }

          @Override
          public Character put(String key, Character value) {
              return null;
          }

          @Override
          public Character remove(Object key) {
              return null;
          }

          @Override
          public void putAll(Map<? extends String, ? extends Character> m) {

          }

          @Override
          public void clear() {

          }

          @Override
          public Set<String> keySet() {
              return null;
          }

          @Override
          public Collection<Character> values() {
              return null;
          }

          @Override
          public Set<Entry<String, Character>> entrySet() {
              return null;
          }
      };
        mydata.put("AMANOJ",'A');
        mydata.put("BVikas",'A');
        mydata.put("CSiva",'B');
        mydata.put("DRAHUL",null);
        mydata.put("AMANOJ",'A');


        System.out.println(mydata);
        System.out.println(mydata.get("Manoj"));
        for (Map.Entry<String,Character> m:mydata.entrySet()){
             String key=m.getKey();
             Character value=m.getValue();
            System.out.println("STUDENT NAME:"+key+"Student marks:"+value);

        }
    }
}
