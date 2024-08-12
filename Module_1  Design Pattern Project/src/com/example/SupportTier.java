package com.example;
// Abstract class for SupportTier
abstract class SupportTier {
    protected SupportTier nextTier;

    public void setNextTier(SupportTier nextTier) {
        this.nextTier = nextTier;
    }

    public abstract void handleTicket(Ticket ticket);
}

// Concrete class for Tier1Support
class Tier1Support extends SupportTier {
    @Override
    public void handleTicket(Ticket ticket) {
        if (ticket.getSeverity() == Severity.LOW) {
            System.out.println("Ticket handled by Tier 1 Support");
        } else {
            if (nextTier != null) {
                nextTier.handleTicket(ticket);
            } else {
                System.out.println("No support tier available to handle ticket");
            }
        }
    }
}

// Concrete class for Tier2Support
class Tier2Support extends SupportTier {
    @Override
    public void handleTicket(Ticket ticket) {
        if (ticket.getSeverity() == Severity.MEDIUM) {
            System.out.println("Ticket handled by Tier 2 Support");
        } else {
            if (nextTier != null) {
                nextTier.handleTicket(ticket);
            } else {
                System.out.println("No support tier available to handle ticket");
            }
        }
    }
}

// Concrete class for Tier3Support
class Tier3Support extends SupportTier {
    @Override
    public void handleTicket(Ticket ticket) {
        if (ticket.getSeverity() == Severity.HIGH) {
            System.out.println("Ticket handled by Tier 3 Support");
        } else {
            System.out.println("No support tier available to handle ticket");
        }
    }
}

// Enum for Severity
enum Severity {
    LOW, MEDIUM, HIGH
}

// Class for Ticket
class Ticket {
    private Severity severity;

    public Ticket(Severity severity) {
        this.severity = severity;
    }

    public Severity getSeverity() {
        return severity;
    }
}
