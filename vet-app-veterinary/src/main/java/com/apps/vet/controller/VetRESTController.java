package com.apps.vet.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.vet.entities.Veterinary;
import com.apps.vet.repos.VeterinaryRepository;

@RestController
@RequestMapping("/vets")
public class VetRESTController {

    @Autowired
    VeterinaryRepository repo;
    
    @GetMapping
    public List<Veterinary> getVeterinaries(){
        
        return repo.findAll();
    }
    
    @PostMapping
    public Veterinary createVet(@RequestBody Veterinary vet) {
        return repo.save(vet);
    }
    
    @PutMapping
    public Veterinary updateVet(@RequestBody Veterinary vet) {
        return repo.save(vet);
    }
    
    @DeleteMapping("/{id}")
    public void deleteVet(@PathVariable("id") Integer id) {
        repo.deleteById(id);
    }
    
    
    @GetMapping("/{id}")
    public Veterinary getVet(@PathVariable("id") Integer id) {
       return repo.getOne(id);
    }
    
    @GetMapping("/{name}")
    public Veterinary getVetByName(@PathVariable("Name") String name) {
       return repo.findByName(name);
    }
    
    
    
}
