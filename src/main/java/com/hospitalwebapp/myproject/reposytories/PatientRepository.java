package com.hospitalwebapp.myproject.reposytories;

import com.hospitalwebapp.myproject.enteties.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

    Patient findPatientByFio(String fio);

}
