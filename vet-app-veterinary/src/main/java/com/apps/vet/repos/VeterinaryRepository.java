package com.apps.vet.repos;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apps.vet.entities.Veterinary;

@Repository
public interface VeterinaryRepository extends JpaRepository<Veterinary, Integer> {

    public Veterinary findByName(String name);
}
