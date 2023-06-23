package com.collections.practice;
    import java.util.*;

    public class WordFrequencyCounter {
        public static void main(String[] args) {
            String paragraph = "The cat and the dog played together. The cat chased the mouse.";

            // Splitting the paragraph into words
            String[] words = paragraph.split("\\s+");

            // Counting word frequencies using a HashMap
            Map<String, Integer> frequencyMap = new HashMap<>();
            for (String word : words) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }

            // Sorting the map entries by value in descending order
            List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
            sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            // Printing the word frequencies
            for (Map.Entry<String, Integer> entry : sortedEntries) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }


