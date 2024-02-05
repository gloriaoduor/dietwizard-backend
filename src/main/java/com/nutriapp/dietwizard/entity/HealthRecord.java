package com.nutriapp.dietwizard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class HealthRecord {
    @Id
    @GeneratedValue
    private Long recordId;

    private Float bmi;
    private Float bmr;
    private String weightCategory;
//    private String foodExchangeData;

    @ManyToOne
    private Client client;
}
