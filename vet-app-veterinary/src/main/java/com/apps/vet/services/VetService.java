package com.apps.vet.services;

import java.util.List;
import java.util.UUID;

import com.apps.vet.entities.Veterinary;

public interface VetService {
    
    Integer saveVeterinary(Veterinary veterinary);

    Veterinary updateVeterinary(Veterinary veterinary);

    void deleteVeterinary(Veterinary veterinary);

    Veterinary getVeterinaryById(Integer id);

    List<Veterinary> getAllVeterinarys();

    
    
}
