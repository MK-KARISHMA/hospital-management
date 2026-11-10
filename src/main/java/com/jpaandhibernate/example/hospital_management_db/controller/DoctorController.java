package com.jpaandhibernate.example.hospital_management_db.controller;


import com.jpaandhibernate.example.hospital_management_db.model.Doctor;
import com.jpaandhibernate.example.hospital_management_db.repository.DoctorRepository;
import com.jpaandhibernate.example.hospital_management_db.service.DoctorService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor/apis")

public class DoctorController {


    // request -> API(Controller) -> service -> repository -> service(response) -> API(response) -> user / frontend  .postman(response)

    // spring boot application - takes input in the form of JSON (javascript object notation)

    //@RequestBody - it is used to take input request from UI or postman and it is used for only complete class inputs
    @Autowired
    DoctorService doctorService;


    @PostMapping("/save")
    public String saveDoctor(@RequestBody Doctor doctor) {
        return  doctorService.saveDoctor(doctor);


    }
}
