package com.hospitalwebapp.myproject.servise;

import com.hospitalwebapp.myproject.enteties.Patient;
import com.hospitalwebapp.myproject.reposytories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;


    public List<Patient> getAllPatients() {
       return patientRepository.findAll();
    }

    public Patient getPatientById(Integer id) {
        return patientRepository.getOne(id);
    }

    public void deletePatientById(Integer id) {
        patientRepository.deleteById(id);
    }

    public Patient getPatientByName(String fio) {
        return patientRepository.findPatientByFio(fio);
    }


}
