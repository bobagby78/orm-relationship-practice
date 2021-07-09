package org.launchcode.orm_relationships_practice.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
