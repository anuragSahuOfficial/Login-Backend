package com.example.LoginApp;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Setter
    @Getter
    @Column
    String username;
    @Setter
    @Getter
    @Column
    String password;
    @Setter
    @Getter
    @Column
    int salary;


    public User() {
        // TODO Auto-generated constructor stub
    }

    public User(int id, String username, String password, int salary) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.salary = salary;
    }
}
