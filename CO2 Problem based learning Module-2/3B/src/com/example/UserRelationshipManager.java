package com.example;

import java.util.HashMap;
import java.util.Map;

public class UserRelationshipManager {
    private Map<Integer, Map<Integer, String>> relationships;

    public UserRelationshipManager() {
        this.relationships = new HashMap<>();
    }

    public void addUserRelationship(int userId, int friendId, String relationshipType) {
        if (!relationships.containsKey(userId)) {
            relationships.put(userId, new HashMap<>());
        }
        relationships.get(userId).put(friendId, relationshipType);
    }

    public Map<Integer, String> getUserRelationships(int userId) {
        return relationships.get(userId);
    }

    public void printUserRelationships(int userId) {
        Map<Integer, String> userRelationships = getUserRelationships(userId);
        if (userRelationships != null) {
            System.out.println("User " + userId + " relationships:");
            for (Map.Entry<Integer, String> entry : userRelationships.entrySet()) {
                System.out.println("  " + entry.getKey() + " - " + entry.getValue());
            }
        } else {
            System.out.println("User " + userId + " has no relationships.");
        }
    }
}