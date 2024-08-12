package com.example;

public class EventPlanner {

	    private java.util.ArrayList<String> events;

	    public EventPlanner() {
	        this.events = new java.util.ArrayList<>();
	    }

	    public void addEvent(String event) {
	        events.add(event);
	    }

	    public void updateEvent(int index, String newEvent) {
	        if (index >= 0 && index < events.size()) {
	            events.set(index, newEvent);
	        }
	    }

	    public void removeEvent(int index) {
	        if (index >= 0 && index < events.size()) {
	            events.remove(index);
	        }
	    }

	    public java.util.ArrayList<String> listAllEvents() {
	        return events;
	    }
	}