package com.apps.vet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.apps.vet.entities.Animal;
import com.apps.vet.repos.AnimalRepository;

@RestController
public class AnimalRestController {

    @Autowired
    AnimalRepository repo;

    @Autowired
    BCryptPasswordEncoder encoder;

    @GetMapping
    public List<Animal> getAnimals() {

        return repo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Animal createAnimal(@RequestBody Animal animal) {
        return repo.save(animal);
    }

    @PutMapping
    public Animal updateAnimal(@RequestBody Animal animal) {
        return repo.save(animal);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable("id") Integer id) {
        repo.deleteById(id);
    }

    @GetMapping("/animals/{id}")
    public Animal getAnimal(@PathVariable("id") Integer id) {
        return repo.getOne(id);
    }

    @GetMapping("/{name}")
    public Animal getAnimalByName(@PathVariable("Name") String name) {
        return repo.findByName(name);
    }
}
