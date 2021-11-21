package sasa.jovanovic.petclinic.services;

import sasa.jovanovic.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
