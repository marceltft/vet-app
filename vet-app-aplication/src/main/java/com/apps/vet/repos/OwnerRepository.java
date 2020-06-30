package com.apps.vet.repos;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apps.vet.entities.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, UUID>{

    
    
}
