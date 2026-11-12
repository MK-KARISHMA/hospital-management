package com.jpaandhibernate.example.hospital_management_db.service;


import com.jpaandhibernate.example.hospital_management_db.model.Ward;
import com.jpaandhibernate.example.hospital_management_db.repository.WardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WardService {

    @Autowired
     WardRepository wardRepository;

    public String addWard(Ward ward) {
        wardRepository.save(ward);
        return "Ward saved successfully!";
    }
}
