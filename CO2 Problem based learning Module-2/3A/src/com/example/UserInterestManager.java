package com.example;

import java.util.HashSet;
import java.util.Set;

public class UserInterestManager {
    private Set<String> userInterests;

    public UserInterestManager() {
        this.userInterests = new HashSet<>();
    }

    public void addInterest(String interest) {
        userInterests.add(interest);
    }

    public void removeInterest(String interest) {
        userInterests.remove(interest);
    }

    public boolean hasInterest(String interest) {
        return userInterests.contains(interest);
    }

    public Set<String> getAllInterests() {
        return userInterests;
    }
}
