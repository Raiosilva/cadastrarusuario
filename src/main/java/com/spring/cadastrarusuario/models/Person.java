package com.spring.cadastrarusuario.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


//Insert attributes and methods and annotation
// => @ = annotation do spring
@Entity
public class Person implements Serializable {

    //Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String email;

    public Person() {}

    public Person(Long id, String name, String email) {
        Id = id;
        this.name = name;
        this.email = email;
    }

    //Method to access on attributes
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
}
