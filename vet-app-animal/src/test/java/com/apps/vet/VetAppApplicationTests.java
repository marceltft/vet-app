package com.apps.vet;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.apps.vet.entities.Role;
import com.apps.vet.entities.Veterinary;
import com.apps.vet.repos.RoleRepository;
import com.apps.vet.repos.VeterinaryRepository;

@SpringBootTest
class VetAppApplicationTests {
    private UUID TEMP_ID = UUID.fromString("8ec9d4a2-58ef-4a70-9b55-0626d6f75dff");
    
    @Autowired
    private VeterinaryRepository repository;

    @Autowired
    private RoleRepository roleRepository;

    @Test
    void testCreateVet() {

        Veterinary vet = new Veterinary();
        
        vet.setName("Natasha Nogueira");
        vet.setPhone("552199999999");
        vet.setEmail("vet@vet.com");
        vet.setSpecialty("Cirurgia");
        vet.setPassword("aaaaa");
        vet.setSocialId("123");
        
        Role role = roleRepository.findByRole("Administrator");
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        vet.setRoles(roles);
        repository.save(vet);
        //assertEquals("Id nao eh null", vet.getId().equals(TEMP_ID));
    }

    @Test
    void readVet() {
       
        Veterinary vet = repository.findByName("Natasha Nogueira");
        System.out.println(vet.getEmail());
        System.out.println(vet.getId());
        
    }

    //@Test
    //@Order(3)
    void deleteVet() {
        repository.deleteById(TEMP_ID);
    }

}
