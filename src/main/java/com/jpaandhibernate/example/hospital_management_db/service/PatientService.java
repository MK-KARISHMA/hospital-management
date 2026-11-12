package com.jpaandhibernate.example.hospital_management_db.service;

import com.jpaandhibernate.example.hospital_management_db.model.Doctor;
import com.jpaandhibernate.example.hospital_management_db.model.Patient;
import com.jpaandhibernate.example.hospital_management_db.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public String addPatient(Patient patient) {
        patientRepository.save(patient);
        return "Patient saved successfully!";
    }


}
