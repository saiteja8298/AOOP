package com.example;

public class Main {
	   public static void main(String[] args) {
	        Ticket ticket = new Ticket("Test ticket", "This is a test ticket", ComplexityLevel.LOW);
	        SupportTier tier = TicketRouter.routeTicket(ticket);
	        System.out.println("Ticket routed to: " + tier);

	        ticket.setSupportTier(SupportTier.TIER1);
	        tier = TicketRouter.escalateTicket(ticket);
	        System.out.println("Ticket escalated to: " + tier);
	    }
	}