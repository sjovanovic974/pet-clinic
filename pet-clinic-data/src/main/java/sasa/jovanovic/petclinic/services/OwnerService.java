package sasa.jovanovic.petclinic.services;

import sasa.jovanovic.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
