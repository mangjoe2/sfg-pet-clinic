package guru.springframework.sfgpetclinic1.services;

import guru.springframework.sfgpetclinic1.model.Owner;



public interface OwnerService extends  CrudeService<Owner, Long>{


    Owner findLastName(String lastName);
}
