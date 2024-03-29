package com.fire.truck.infrastructure.adapter.secondary.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "truck")
public class TruckEntity {

    @Id
    @Column(unique = true)
    private String plate;

    @Column(name = "telematics")
    private boolean telematicsEnabled;
}
