package com.example;
import java.util.HashSet;
public class User {
    private int id;
    private String name;
    private HashSet<String> interests;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.interests = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<String> getInterests() {
        return interests;
    }

    public void addInterest(String interest) {
        this.interests.add(interest);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", interests=" + interests +
                '}';
    }
}