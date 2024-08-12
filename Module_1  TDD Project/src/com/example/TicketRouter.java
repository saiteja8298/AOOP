package com.example;

public class TicketRouter {
	   public static SupportTier routeTicket(Ticket ticket) {
	        switch (ticket.getComplexityLevel()) {
	            case LOW:
	                return SupportTier.TIER1;
	            case MEDIUM:
	                return SupportTier.TIER2;
	            case HIGH:
	                return SupportTier.TIER3;
	            default:
	                return null;
	        }
	    }

	    public static SupportTier escalateTicket(Ticket ticket) {
	        switch (ticket.getSupportTier()) {
	            case TIER1:
	                return SupportTier.TIER2;
	            case TIER2:
	                return SupportTier.TIER3;
	            case TIER3:
	                return SupportTier.TIER3;
	            default:
	                return null;
	        }
	    }
	}
