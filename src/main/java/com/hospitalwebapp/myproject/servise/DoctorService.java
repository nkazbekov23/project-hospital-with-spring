package com.hospitalwebapp.myproject.servise;

import com.hospitalwebapp.myproject.enteties.Doctor;
import com.hospitalwebapp.myproject.reposytories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;


    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(Integer id) {
        return doctorRepository.getOne(id);
    }

}
