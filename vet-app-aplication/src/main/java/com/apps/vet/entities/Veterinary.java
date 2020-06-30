package com.apps.vet.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class Veterinary extends User {

    
    private String specialty;

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(final String specialty) {
        this.specialty = specialty;
    }


}
