package guru.springframework.sfgpetclinic1.repositories;

import guru.springframework.sfgpetclinic1.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
