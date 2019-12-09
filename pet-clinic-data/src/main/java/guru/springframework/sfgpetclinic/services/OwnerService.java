package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * @author diegorl84@gmail.com
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}