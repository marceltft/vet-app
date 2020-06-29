package com.apps.vet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.apps.vet.entities.Veterinary;
import com.apps.vet.repos.VeterinaryRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class VetAppApplicationTests {

    @Autowired
    private VeterinaryRepository repository;
    private int tempId = 9999;

    //@Test
    @Order(1)
    void testCreateVet() {

        Veterinary vet = new Veterinary();
        vet.setId(tempId);
        vet.setName("Natasha Nogueira");
        vet.setPhone("552199999999");
        vet.setEmail("vet@vet.com");
        vet.setPassword("aaaaa");
        vet.setSocialId("123");

        repository.save(vet);

    }


   // @Test
    @Order(30)
    void testRemoveVet() {

        Veterinary veterinary = repository.findById(tempId).get();
        repository.delete(veterinary);
        assertFalse(repository.existsById(tempId), "User was removed");

    }
    
    //@Test
    @Order(2)
    void testReadVet() {
        Veterinary vet = repository.findById(tempId).get();
        //Veterinary vet = repository.findByName("Natasha Nogueira");
        assertEquals("Id nao eh null", vet.getId() == tempId);

    }

}
