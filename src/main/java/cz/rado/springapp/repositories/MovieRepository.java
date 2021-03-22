package cz.rado.springapp.repositories;

import cz.rado.springapp.model.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {
    List<Movie> findByName(String name);
}
