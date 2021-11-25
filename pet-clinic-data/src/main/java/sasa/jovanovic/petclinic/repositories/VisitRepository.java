package sasa.jovanovic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sasa.jovanovic.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
