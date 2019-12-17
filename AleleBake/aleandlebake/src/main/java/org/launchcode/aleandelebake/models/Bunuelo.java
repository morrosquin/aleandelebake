package org.launchcode.aleandelebake.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Bunuelo {

    @Id
    @GeneratedValue
    private int id;


    @NotNull
    @Size(min=3, max=30)
    private String name;

    @NotNull
    @Size(min=5, message = "message must not be empty")
    private String message;

    public Bunuelo(String name, String message) {
        super();
        this.name = name;
        this.id = id;
        this.message = message;
    }

    public Bunuelo() { }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getMessage() {
        return message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) { this.message = message;
    }
}



