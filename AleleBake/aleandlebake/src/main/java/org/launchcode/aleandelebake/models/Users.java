package org.launchcode.aleandelebake.models;

//import org.springframework.data.annotation.Id;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Users {
    @Id
    @GeneratedValue
    private int id;

    public Users() {
//        this.id = id;
    }
}
