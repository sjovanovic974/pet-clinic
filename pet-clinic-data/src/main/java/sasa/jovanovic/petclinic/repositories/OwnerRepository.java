package sasa.jovanovic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sasa.jovanovic.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
