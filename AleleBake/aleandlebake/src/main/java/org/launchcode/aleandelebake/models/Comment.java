package org.launchcode.aleandelebake.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Comment {

    // An autogenerated id (unique for each user in the db)
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, max = 30)
    private String name;

    @NotNull
    @Size(min = 1, message = "date must not be empty")
    private String date;

    @NotNull
    @Size(min = 5, message = "message must not be empty")
    private String message;

    public Comment(String name, String date, String message) {
        super();
        this.id = id;
        this.name = name;
        this.date = date;
        this.message = message;
    }

    public Comment() { }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(String date) {
        this.date = date;
    }
}