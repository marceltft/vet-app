package com.apps.vet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.apps.vet.entities.Owner;
import com.apps.vet.repos.OwnerRepository;

public class OwnerServiceImpl implements OwnerService {

    @Autowired
    OwnerRepository repository;

    @Override
    public int saveOwner(Owner owner) {

        repository.save(owner);
        return owner.getId();
    }

    @Override
    public Owner updateOwner(Owner owner) {
        repository.save(owner);
        return owner;
    }

    @Override
    public void deleteOwner(Owner owner) {
        repository.delete(owner);
    }

    @Override
    public Owner getOwnerById(int id) {

        return repository.getOne(id);
    }

    @Override
    public List<Owner> getAllOwners() {

        return repository.findAll();
    }

}
