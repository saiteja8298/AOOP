package com.example;

public class ContactManagement {
	    private java.util.Set<Contact> uniqueContacts;
	    private java.util.Map<java.lang.String, Contact> contactDetails;

	    public ContactManagement() {
	        this.uniqueContacts = new java.util.HashSet<>();
	        this.contactDetails = new java.util.HashMap<>();
	    }

	    public void addContact(Contact contact) {
	        if (!uniqueContacts.contains(contact)) {
	            uniqueContacts.add(contact);
	            contactDetails.put(contact.getName(), contact);
	            System.out.println("Contact added: " + contact);
	        } else {
	            System.out.println("Contact already exists: " + contact.getName());
	        }
	    }

	    public void removeContact(java.lang.String name) {
	        for (Contact contact : uniqueContacts) {
	            if (contact.getName().equals(name)) {
	                uniqueContacts.remove(contact);
	                contactDetails.remove(name);
	                System.out.println("Contact removed: " + name);
	                return;
	            }
	        }
	        System.out.println("Contact not found: " + name);
	    }

	    public void updateContact(java.lang.String name, java.lang.String phoneNumber) {
	        if (contactDetails.containsKey(name)) {
	            Contact contact = contactDetails.get(name);
	            contact.setPhoneNumber(phoneNumber);
	            System.out.println("Contact updated: " + contact);
	        } else {
	            System.out.println("Contact not found: " + name);
	        }
	    }

	    public void displayContacts() {
	        if (uniqueContacts.isEmpty()) {
	            System.out.println("No contacts found.");
	            return;
	        }
	        System.out.println("Contacts:");
	        for (Contact contact : uniqueContacts) {
	            System.out.println(contact);
	        }
	    }
	}
