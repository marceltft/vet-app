package com.apps.vet;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.apps.vet.entities.Animal;
import com.apps.vet.entities.Owner;
import com.apps.vet.repos.OwnerRepository;

@SpringBootTest
class OwnerTests {
    
    @Autowired
    private OwnerRepository repository;


    @Test
    void createOwnerTest() {
        Owner owner = new Owner();
        owner.setId(9999);
        owner.setEmail("a.a@a.com");
        owner.setName("Asdrubal da Silva");
        owner.setPassword("aaaaa");
        owner.setPhone("2212121212");
        owner.setSocialId("123");
        Set<Animal> animals = new HashSet<>();
         
        
        Animal cao = new Animal();
        cao.setBreed("vira-lata");
        cao.setName("Totó");
        cao.setSex("M");
        cao.setSpecies("Cachorro");
        
        cao.setBirthday(new GregorianCalendar(2012, Calendar.APRIL, 23).getTime());
        
        cao.setOwner(owner);
        animals.add(cao);
        
        Animal gato = new Animal();
        gato.setBreed("Persa");
        gato.setName("Figado");
        gato.setSex("F");
        gato.setSpecies("Gato");
        gato.setBreed("1/4/2015");
        gato.setOwner(owner);
        gato.setBirthday(new GregorianCalendar(2012, Calendar.MARCH, 11).getTime());
        animals.add(gato);
        owner.setAnimals(animals);
        repository.save(owner);
    }

    //@Test
    void deleteOwnerTest() {
       

    }

}
