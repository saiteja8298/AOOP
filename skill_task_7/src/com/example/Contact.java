package com.example;

public class Contact {
	    private java.lang.String name;
	    private java.lang.String phoneNumber;

	    public Contact(java.lang.String name, java.lang.String phoneNumber) {
	        this.name = name;
	        this.phoneNumber = phoneNumber;
	    }

	    public java.lang.String getName() {
	        return name;
	    }

	    public java.lang.String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(java.lang.String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    @Override
	    public java.lang.String toString() {
	        return name + " - " + phoneNumber;
	    }
	}