package com.example;

public class Ticket {
    private String title;
    private String description;
    private ComplexityLevel complexityLevel;
    private SupportTier supportTier;

    public Ticket(String title, String description, ComplexityLevel complexityLevel) {
        this.title = title;
        this.description = description;
        this.complexityLevel = complexityLevel;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public ComplexityLevel getComplexityLevel() {
        return complexityLevel;
    }

    public SupportTier getSupportTier() {
        return supportTier;
    }

    public void setSupportTier(SupportTier supportTier) {
        this.supportTier = supportTier;
    }
}

