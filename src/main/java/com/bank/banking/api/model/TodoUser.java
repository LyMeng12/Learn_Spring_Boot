package com.bank.banking.api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Data
@Entity
@Table(name = "todo_user")
public class TodoUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;
    private String description;

    private String password;

    private Double money;

    private Boolean completed;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;
}
