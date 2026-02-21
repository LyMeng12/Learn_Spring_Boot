package com.bank.banking.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@Entity(name="ToDoUser")
@Table(name="todouser")
public class TodoUser {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column (name="money", nullable = false)
    private Double money;

    private Boolean completed;

    @Column(name="create.at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @Column(name="update.at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;



}
