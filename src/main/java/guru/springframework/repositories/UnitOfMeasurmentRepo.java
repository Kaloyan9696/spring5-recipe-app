package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasurmentRepo extends CrudRepository<UnitOfMeasure, Long> {
}
