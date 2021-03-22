package cz.rado.springapp.service;

import cz.rado.springapp.model.Movie;
import cz.rado.springapp.model.dto.MovieDTO;

import java.util.List;

public interface MovieService {

    Movie createAndAddMovie();


    MovieDTO getMovieById(Long id);

    List<MovieDTO> getAllMovies();

    List<MovieDTO> findMovieByName(String name);

    MovieDTO addMovie(MovieDTO movieDTO);

    MovieDTO updateMovie(MovieDTO movieDTO, long movieId);

    void deleteMovie(long id);
}
