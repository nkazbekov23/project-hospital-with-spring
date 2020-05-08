package com.hospitalwebapp.myproject.reposytories;

import com.hospitalwebapp.myproject.enteties.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
