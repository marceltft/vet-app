package com.apps.vet.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.apps.vet.entities.Veterinary;
import com.apps.vet.repos.VeterinaryRepository;

public class VetServiceImpl implements VetService {
    @Autowired
    private VeterinaryRepository repository;

    @Override
    public Integer saveVeterinary(Veterinary vet) {
        
        repository.save(vet);
        return vet.getId();
    }

    @Override
    public Veterinary updateVeterinary(Veterinary vet) {
        repository.save(vet);
        return vet;
    }

    @Override
    public void deleteVeterinary(Veterinary vet) {
        repository.delete(vet);
    }

    @Override
    public Veterinary getVeterinaryById(Integer id) {
        
        return repository.findById(id).get();
    }

    @Override
    public List<Veterinary> getAllVeterinarys() {
        return repository.findAll();
    }

}
