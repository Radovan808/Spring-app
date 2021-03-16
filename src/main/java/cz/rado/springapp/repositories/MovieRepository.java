package cz.rado.springapp.repositories;

import cz.rado.springapp.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
