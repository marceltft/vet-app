package com.apps.vet.repos;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apps.vet.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, UUID>{

    
    public Role findByRole (String role);
}
