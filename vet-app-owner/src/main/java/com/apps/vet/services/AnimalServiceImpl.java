package com.apps.vet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.apps.vet.entities.Animal;
import com.apps.vet.repos.AnimalRepository;

public class AnimalServiceImpl implements AnimalService {
    
    @Autowired
    AnimalRepository repository;
    

    @Override
    public int saveAnimal(Animal animal) {
        repository.save(animal);
        return animal.getId();
    }

    @Override
    public Animal updateAnimal(Animal animal) {
        return repository.save(animal);
    }

    @Override
    public void deleteAnimal(Animal animal) {
        repository.delete(animal);
    }

    @Override
    public Animal findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Animal> findAll() {
        return repository.findAll();
    }

}
