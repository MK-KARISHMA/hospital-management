
package com.jpaandhibernate.example.hospital_management_db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patient")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Patient {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "patient_name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "dob", nullable = false)
    private String dob;

    @Column(name = "mobile", nullable = false, unique = true)
    private String mobile;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "disease", nullable = false)
    private String disease;
}
