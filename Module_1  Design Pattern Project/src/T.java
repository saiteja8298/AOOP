package com.example;

public class T {
    public static void main(String[] args) {
        // Create support tiers
        SupportTier tier1 = new Tier1Support();
        SupportTier tier2 = new Tier2Support();
        SupportTier tier3 = new Tier3Support();

        // Set next tier for each support tier
        tier1.setNextTier(tier2);
        tier2.setNextTier(tier3);

        // Create tickets
        Ticket lowSeverityTicket = new Ticket(Severity.LOW);
        Ticket mediumSeverityTicket = new Ticket(Severity.MEDIUM);
        Ticket highSeverityTicket = new Ticket(Severity.HIGH);

        // Handle tickets
        tier1.handleTicket(lowSeverityTicket);
        tier1.handleTicket(mediumSeverityTicket);
        tier1.handleTicket(highSeverityTicket);
    }
}