package com.jpaandhibernate.example.hospital_management_db.controller;


import com.jpaandhibernate.example.hospital_management_db.model.Patient;
import com.jpaandhibernate.example.hospital_management_db.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient/apis")
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("/save")
    public String savePatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }
}
