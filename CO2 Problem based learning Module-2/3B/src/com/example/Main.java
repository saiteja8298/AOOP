package com.example;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "John");
        user1.addInterest("Sports");
        user1.addInterest("Music");

        User user2 = new User(2, "Jane");
        user2.addInterest("Reading");
        user2.addInterest("Traveling");

        UserRelationshipManager relationshipManager = new UserRelationshipManager();
        relationshipManager.addUserRelationship(1, 2, "Friend");
        relationshipManager.addUserRelationship(2, 1, "Friend");

        System.out.println("User 1: " + user1);
        System.out.println("User 2: " + user2);

        relationshipManager.printUserRelationships(1);
        relationshipManager.printUserRelationships(2);
    }
}