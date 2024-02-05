package com.nutriapp.dietwizard.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Client {
    @Id
    @GeneratedValue
    private Long clientId;

    private String clientName;
    private Integer age;
    private String sex;
    private Float height;
    private Float weight;
    private String activityLevel;

    @ManyToOne
    private User user;

    @OneToMany
    private List<HealthRecord> healthRecords;
}
