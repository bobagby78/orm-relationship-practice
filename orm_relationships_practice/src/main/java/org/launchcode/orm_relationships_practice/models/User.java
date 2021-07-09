package org.launchcode.orm_relationships_practice.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String firstName;
    private String lastName;

    @ManyToOne //many users can come from one location. check the location side for further details
    private Location location;
    private String email;

    @OneToMany //one user can make many posts. the following will list the many posts by one user.
    private List<Post> posts = new ArrayList<>();

    public User(int id){
        this.id = id;

    }

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
