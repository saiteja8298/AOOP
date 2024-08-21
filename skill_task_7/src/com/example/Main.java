package com.example;

public class Main {
	    public static void main(java.lang.String[] args) {
	        ContactManagement contactManagement = new ContactManagement();

	        Contact contact1 = new Contact("John Doe", "1234567890");
	        Contact contact2 = new Contact("Jane Doe", "0987654321");
	        Contact contact3 = new Contact("John Doe", "1234567890"); // duplicate contact

	        contactManagement.addContact(contact1);
	        contactManagement.addContact(contact2);
	        contactManagement.addContact(contact3);

	        contactManagement.displayContacts();

	        contactManagement.removeContact("Jane Doe");

	        contactManagement.displayContacts();

	        contactManagement.updateContact("John Doe", "1111111111");

	        contactManagement.displayContacts();
	    }
	}