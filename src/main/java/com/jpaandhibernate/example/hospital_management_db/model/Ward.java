
package com.jpaandhibernate.example.hospital_management_db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ward")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ward {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "ward_name", nullable = false)
    private String wardName;

    @Column(name = "ward_type", nullable = false)
    private String wardType;

    @Column(name = "capacity", nullable = false)
    private int capacity;

    @Column(name = "available_beds", nullable = false)
    private int availableBeds;

    @Column(name = "charges_per_day", nullable = false)
    private double chargesPerDay;
}
