package com.apps.vet.services;

import java.util.List;

import com.apps.vet.entities.Owner;

public interface OwnerService {

    int saveOwner(Owner owner);

    Owner updateOwner(Owner owner);

    void deleteOwner(Owner owner);

    Owner getOwnerById(int id);

    List<Owner> getAllOwners();

}
