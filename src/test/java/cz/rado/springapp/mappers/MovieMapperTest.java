package cz.rado.springapp.mappers;

import cz.rado.springapp.model.Movie;
import cz.rado.springapp.model.dto.MovieDTO;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MovieMapperTest {

    @Test
    public void movieToMovieDtoIsSame(){
        Movie movie = new Movie();
        movie.setName("Fireproof");
        movie.setId(1L);
        Set<String> set = new HashSet<>();
        set.add("Alex Kendrick");

        MovieDTO movieDTO = MovieMapper.INSTANCE.movieToMovieDto(movie);

        assertEquals(movie.getId(),movieDTO.getId());
        assertEquals(movie.getName(),movieDTO.getName());
        assertArrayEquals(movie.getDirectors().toArray(),
                movieDTO.getDirectorsOfTheMovie().toArray());

    }
}