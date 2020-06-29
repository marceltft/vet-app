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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.apps.vet.entities.Veterinary;
import com.apps.vet.repos.VeterinaryRepository;

@RestController
@RequestMapping("/vets")
public class VetRESTController {

    @Autowired
    VeterinaryRepository repo;
    
    @Autowired
    BCryptPasswordEncoder encoder;
    
    @GetMapping
    public List<Veterinary> getVeterinaries(){
        
        return repo.findAll();
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Veterinary createVet(@RequestBody Veterinary vet) {
            vet.setPassword(encoder.encode(vet.getPassword()));
        return repo.save(vet);
    }
    
    @PutMapping
    public Veterinary updateVet(@RequestBody Veterinary vet) {
        vet.setPassword(encoder.encode(vet.getPassword()));
        return repo.save(vet);
    }
    
    @DeleteMapping("/{id}")
    public void deleteVet(@PathVariable("id") Integer id) {
        repo.deleteById(id);
    }
    
    
    @GetMapping("/vets/{id}")
    public Veterinary getVet(@PathVariable("id") Integer id) {
       return repo.getOne(id);
    }
    
    @GetMapping("/{name}")
    public Veterinary getVetByName(@PathVariable("Name") String name) {
       return repo.findByName(name);
    }
    
    
    
}
