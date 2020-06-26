package com.apps.vet.repos;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apps.vet.entities.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, UUID>{

    
    
}
