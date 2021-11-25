package sasa.jovanovic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sasa.jovanovic.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
