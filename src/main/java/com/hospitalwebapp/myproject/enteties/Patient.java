package com.hospitalwebapp.myproject.enteties;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "fio")
    private String fio;

    @Column(name = "anamnez")
    private String anamnez;



    public Patient(int id, String fio, String anamnez) {
        this.id = id;
        this.fio = fio;
        this.anamnez = anamnez;
    }

    public Patient() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAnamnez() {
        return anamnez;
    }

    public void setAnamnez(String anamnez) {
        this.anamnez = anamnez;
    }

}

