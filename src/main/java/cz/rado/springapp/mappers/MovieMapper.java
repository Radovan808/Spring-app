package cz.rado.springapp.mappers;

import cz.rado.springapp.model.Movie;
import cz.rado.springapp.model.dto.MovieDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MovieMapper {
    MovieMapper INSTANCE = Mappers.getMapper( MovieMapper.class );

    @Mapping(target = "directorsOfTheMovie", source = "directors")
    MovieDTO movieToMovieDto(Movie movie);

    @Mapping(target = "directors", source = "directorsOfTheMovie")
    Movie movieDtoToMovie(MovieDTO movieDTO);
}
