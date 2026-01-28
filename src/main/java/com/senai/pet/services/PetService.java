package com.senai.pet.services;

import com.senai.pet.dtos.PetDto;
import com.senai.pet.repositories.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    private PetRepository petRepository;

    public PetService(PetRepository petRepository){
        this.petRepository = petRepository;
    }


}
