package guru.springframework.sfgpetclinic1.repositories;

import guru.springframework.sfgpetclinic1.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
