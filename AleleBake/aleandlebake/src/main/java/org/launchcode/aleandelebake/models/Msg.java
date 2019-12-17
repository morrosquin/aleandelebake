package org.launchcode.aleandelebake.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Msg {

    // An autogenerated id (unique for each user in the db)
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, max = 30)
    private String name;

    @NotNull
    @Size(min = 8, message = "email must not be empty")
    private String email;

    @NotNull
    @Size(min = 8, message = "date must not be empty")
    private String date;

    @NotNull
    @Size(min = 5, message = "message must not be empty")
    private String msg;


    public Msg(String name, String email, String date, String msg) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.date = date;
        this.msg = msg;
    }

    public Msg() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}

