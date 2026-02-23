package com.bank.banking.api.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    private Long id;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
