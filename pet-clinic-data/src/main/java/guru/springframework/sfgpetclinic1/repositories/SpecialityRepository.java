package guru.springframework.sfgpetclinic1.repositories;


import guru.springframework.sfgpetclinic1.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
