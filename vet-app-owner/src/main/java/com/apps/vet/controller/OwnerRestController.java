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

import com.apps.vet.entities.Owner;
import com.apps.vet.repos.OwnerRepository;

public class OwnerRestController {

    
    

    @Autowired
    OwnerRepository repo;

    @Autowired
    BCryptPasswordEncoder encoder;

    @GetMapping
    public List<Owner> getOwners() {

        return repo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Owner createOwner(@RequestBody Owner owner) {
        return repo.save(owner);
    }

    @PutMapping
    public Owner updateOwner(@RequestBody Owner owner) {
        return repo.save(owner);
    }

    @DeleteMapping("/{id}")
    public void deleteOwner(@PathVariable("id") Integer id) {
        repo.deleteById(id);
    }

    @GetMapping("/owners/{id}")
    public Owner getOwner(@PathVariable("id") Integer id) {
        return repo.getOne(id);
    }

    @GetMapping("/{name}")
    public Owner getOwnerByName(@PathVariable("Name") String name) {
        return repo.findByName(name);
    
    }   
}
