package com.apps.vet.services;

import java.util.List;
import java.util.UUID;

import com.apps.vet.entities.Veterinary;

public interface VetService {
    
    UUID saveVeterinary(Veterinary veterinary);

    Veterinary updateVeterinary(Veterinary veterinary);

    void deleteVeterinary(Veterinary veterinary);

    Veterinary getVeterinaryById(UUID id);

    List<Veterinary> getAllVeterinarys();

    
    
}
