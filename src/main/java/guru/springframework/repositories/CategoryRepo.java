package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepo extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String name);
}
