package org.launchcode.aleandelebake.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categories {
    @Id
    @GeneratedValue
    private int id;
}
