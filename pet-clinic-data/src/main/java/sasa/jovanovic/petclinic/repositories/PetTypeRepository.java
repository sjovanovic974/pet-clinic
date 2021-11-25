package sasa.jovanovic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sasa.jovanovic.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
