package com.jpaandhibernate.example.hospital_management_db.service;

import com.jpaandhibernate.example.hospital_management_db.model.Doctor;
import com.jpaandhibernate.example.hospital_management_db.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service // it contains the business logic
public class DoctorService {


    @Autowired
    DoctorRepository doctorRepository;

    public String addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
        return "Doctor saved successfully!";
    }

    public Doctor getDoctorById(int id) {
        Optional<Doctor> doctorOptional = doctorRepository.findById(id);
        if(doctorOptional.isPresent()) {
            return doctorOptional.get();
        } else {
            return null;
        }
    }


    public List<Doctor> getAllDoctors() {
        List<Doctor> doctorList =  doctorRepository.findAll();
        return doctorList;
    }

    public String countDoctors() {
        long totalCount = doctorRepository.count();
        return "Total doctors present are : " + totalCount;
    }

    public String deleteDoctorById(int id) {
        Doctor existingDoctor = getDoctorById(id);
        if(existingDoctor != null) {
           doctorRepository.delete(existingDoctor);
            return "Doctor with id : " + id + " is deleted successfully";

        } else {
            return "Doctor with id : " + id + " is not present, hence cannot delete";
        }
    }

    // update using put operation - updates the complete object
    public String updateDoctorUsingPut(int doctorId, @RequestBody Doctor newDoctorRequest) {
        // find doctor with id
        // if doctor is present, update it else we cannot update

        Doctor existingDoctor = getDoctorById(doctorId);

        if(existingDoctor != null) {
            //proceed to update
            doctorRepository.save(newDoctorRequest); // save will create a new record if id is not already present, and it will update the records if id is already present
            return "Doctor with id : " + doctorId + " is updated successfully";
        } else {
            // cannot update
            return "Doctor with id : " + doctorId + " is not present, hence cannot update";
        }

    }

    // update using patch operation - updates single specific fields
    public String updateDoctorUsingPatch(int doctorId, String newMobile, String newEmail) {
        Doctor existingDoctor = getDoctorById(doctorId);
        if(existingDoctor != null) {
            //proceed to update
            existingDoctor.setMobile(newMobile);
            existingDoctor.setEmail(newEmail);
            doctorRepository.save(existingDoctor); // save will create a new record if id is not already present, and it will update the records if id is already present
            return "Doctor with id : " + doctorId + " is updated successfully";
        } else {
            // cannot update
            return "Doctor with id : " + doctorId + " is not present, hence cannot update";
        }

    }
}
