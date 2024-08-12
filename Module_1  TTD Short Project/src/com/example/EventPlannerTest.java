package com.example;

public class EventPlannerTest {
	    public static void testAddEvent() {
	        EventPlanner planner = new EventPlanner();
	        planner.addEvent("Birthday Party");
	        java.util.ArrayList<String> events = planner.listAllEvents();
	        assert events.size() == 1;
	        assert events.get(0).equals("Birthday Party");
	        System.out.println("Test addEvent passed");
	    }

	    public static void testUpdateEvent() {
	        EventPlanner planner = new EventPlanner();
	        planner.addEvent("Birthday Party");
	        planner.updateEvent(0, "Wedding Ceremony");
	        java.util.ArrayList<String> events = planner.listAllEvents();
	        assert events.size() == 1;
	        assert events.get(0).equals("Wedding Ceremony");
	        System.out.println("Test updateEvent passed");
	    }

	    public static void testRemoveEvent() {
	        EventPlanner planner = new EventPlanner();
	        planner.addEvent("Birthday Party");
	        planner.addEvent("Wedding Ceremony");
	        planner.removeEvent(0);
	        java.util.ArrayList<String> events = planner.listAllEvents();
	        assert events.size() == 1;
	        assert events.get(0).equals("Wedding Ceremony");
	        System.out.println("Test removeEvent passed");
	    }

	    public static void testListAllEvents() {
	        EventPlanner planner = new EventPlanner();
	        planner.addEvent("Birthday Party");
	        planner.addEvent("Wedding Ceremony");
	        planner.addEvent("Graduation Party");
	        java.util.ArrayList<String> events = planner.listAllEvents();
	        assert events.size() == 3;
	        assert events.get(0).equals("Birthday Party");
	        assert events.get(1).equals("Wedding Ceremony");
	        assert events.get(2).equals("Graduation Party");
	        System.out.println("Test listAllEvents passed");
	    }

	    public static void main(String[] args) {
	        testAddEvent();
	        testUpdateEvent();
	        testRemoveEvent();
	        testListAllEvents();
	    }
	}