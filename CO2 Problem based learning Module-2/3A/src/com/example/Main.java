package com.example;


public class Main {
    public static void main(String[] args) {
        UserInterestManager manager = new UserInterestManager();
        manager.addInterest("reading");
        manager.addInterest("hiking");
        manager.addInterest("coding");

        System.out.println("User interests: " + manager.getAllInterests());
        System.out.println("Has interest in reading: " + manager.hasInterest("reading"));
        System.out.println("Has interest in swimming: " + manager.hasInterest("swimming"));

        manager.removeInterest("hiking");
        System.out.println("User interests after removing hiking: " + manager.getAllInterests());
    }
}