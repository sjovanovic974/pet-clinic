package sasa.jovanovic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sasa.jovanovic.petclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
