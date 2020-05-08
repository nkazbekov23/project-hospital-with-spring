package com.hospitalwebapp.myproject.Controller;


import com.hospitalwebapp.myproject.enteties.Doctor;
import com.hospitalwebapp.myproject.enteties.Patient;
import com.hospitalwebapp.myproject.servise.DoctorService;
import com.hospitalwebapp.myproject.servise.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HospitalController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private DoctorService doctorService;


    //home page
    @GetMapping("/hospital")
    public String hospital() {
        return "hospital";
    }


    @GetMapping("/doctor/{id}")//получить доктора по айди
    public String getDoctorById(Model model, @PathVariable("id") int id) {

        Doctor doctor = doctorService.getDoctorById(id);
        model.addAttribute("doc", doctor);

        return "doctor";

    }

    @GetMapping("/patient/{id}")//получить пациента по айди
    public String getPatientById(Model model, @PathVariable("id") Integer id) {

        Patient patient = patientService.getPatientById(id);
        model.addAttribute("patient", patient);

        return "patient";
    }

    @GetMapping("/doctors")//список всех докторов
    public String getAllDoctors(Model model) {

        List<Doctor> allDoc = doctorService.getAllDoctors();
        model.addAttribute("doctors", allDoc);

        return "doctors";
    }

    @GetMapping("/patients")//список всех пациентов
    public String getAllPatients(Model model) {

        List<Patient> allPatients = patientService.getAllPatients();
        model.addAttribute("patПМБДЬЛТОИРНй1    ёients", allPatients);

        return "patients";
    }
}
