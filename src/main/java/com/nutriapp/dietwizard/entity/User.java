package com.nutriapp.dietwizard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long userId;

    private String email;
    private String password;

    @OneToMany
    private List<Client> clients;

}
