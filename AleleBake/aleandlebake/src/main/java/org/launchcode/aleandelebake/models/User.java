package org.launchcode.aleandelebake.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class User {

    // An autogenerated id (unique for each user in the db)
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String email;

    public User(String email) {
        super();
        this.email = email;

        this.id = id;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.email = email;
    }
}