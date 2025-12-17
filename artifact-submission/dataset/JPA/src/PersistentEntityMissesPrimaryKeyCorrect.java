package com.example.jpa;

@javax.persistence.Entity
public class HasIdEntity {
    private Long id;
    private String name;

    @javax.persistence.Id
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
