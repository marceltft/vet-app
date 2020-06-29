package com.apps.vet.services;

import java.util.List;

import com.apps.vet.entities.Animal;

public interface AnimalService {

    int saveAnimal(Animal animal);

    Animal updateAnimal(Animal animal);

    void deleteAnimal(Animal animal);

    Animal findById(int id);

    List<Animal> findAll();
   
}
