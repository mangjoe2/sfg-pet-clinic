package guru.springframework.sfgpetclinic1.repositories;

import guru.springframework.sfgpetclinic1.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
