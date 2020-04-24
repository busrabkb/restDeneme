package com.restDeneme.restDeneme;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class dbUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;


    String name;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public dbUser(String name) {
        this.name=name;
    }

    public dbUser() {
    }
}
