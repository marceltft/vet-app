package com.apps.vet.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apps.vet.entities.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer>{

    Animal findByName(String name);
    
}
