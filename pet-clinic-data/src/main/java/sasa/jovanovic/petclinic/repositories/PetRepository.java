package sasa.jovanovic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sasa.jovanovic.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
