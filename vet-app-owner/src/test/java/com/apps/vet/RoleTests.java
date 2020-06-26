package com.apps.vet;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.apps.vet.entities.Role;
import com.apps.vet.entities.Veterinary;
import com.apps.vet.repos.VeterinaryRepository;

@SpringBootTest
class RoleTests {
    private UUID TEMP_ID = UUID.fromString("8ec9d4a2-58ef-4a70-9b55-0626d6f75dff");
    
    @Autowired
    private VeterinaryRepository repository;


    @Test
    void readVet() {
       
        Veterinary vet = repository.findByName("Natasha Nogueira");
        System.out.println(vet.getEmail());
        System.out.println(vet.getId());
        
    }


}
