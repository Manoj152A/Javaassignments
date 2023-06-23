package com.collections.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
  public class ContactManager {
        public static void main(String[] args) {
            List<Contact> contacts = new ArrayList<>();
            // Assume the contacts list is populated with Contact objects

            HashSet<String> uniqueEmails = new HashSet<>();
            List<Contact> uniqueContacts = new ArrayList<>();

            for (Contact contact : contacts) {
                if (!uniqueEmails.contains(contact.getEmail())) {
                    uniqueEmails.add(contact.getEmail());
                    uniqueContacts.add(contact);
                }
            }

            System.out.println("Original Contact List: " + contacts);
            System.out.println("Unique Contact List: " + uniqueContacts);
        }
    }

    class Contact {
        private String name;
        private String email;
        private String phoneNumber;

        // Constructor, getters, and setters omitted for brevity

        public String getEmail() {
            return email;
        }
    }


