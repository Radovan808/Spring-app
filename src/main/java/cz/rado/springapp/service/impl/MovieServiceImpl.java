package cz.rado.springapp.service.impl;

import cz.rado.springapp.model.Movie;
import cz.rado.springapp.repositories.MovieRepository;
import cz.rado.springapp.service.MovieService;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie createAndAddMovie() {

        Movie movie = new Movie();
        movie.setName("Batman");

        return movieRepository.save(movie);
    }
}
