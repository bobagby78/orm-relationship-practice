package org.launchcode.orm_relationships_practice.models;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Location {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany //one location, many users at that location. This will provide a list of the many users in the one location.
    private List<User> users = new ArrayList<>();

    public Location(int id) {
        this.id = id;
    }

    public Location (){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
