package com.springDrone.ecommerce.model;

public class Team implements Comparable<Team> {
    private String name;

    public Team(String name) {
        this.name = name;
    }

     // Getter method for name field
    public String getName() {
        return name;
    }
    
    // Setter method for name field
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Team other) {
        // Implement comparison logic if needed
        return this.name.compareTo(other.name);
    }
}
