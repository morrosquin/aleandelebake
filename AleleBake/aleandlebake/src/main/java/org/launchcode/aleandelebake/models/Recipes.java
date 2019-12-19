package org.launchcode.aleandelebake.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity //Store this class in a database

public class Recipes {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, max = 40)
    private String name;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String description;


    public Recipes(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Recipes() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
