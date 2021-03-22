package cz.rado.springapp.controller;

import cz.rado.springapp.model.dto.MovieDTO;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;



@Component
public class MovieResourcesAssembler implements ResourceAssembler<MovieDTO, Resource<MovieDTO>> {
    @Override
    public Resource<MovieDTO> toResource(MovieDTO movieDTO) {
        return new Resource<>(movieDTO,
                linkTo(methodOn(MovieRestController.class)
                        .getMovieById(movieDTO.getId())).withSelfRel(),
                linkTo(methodOn(MovieRestController.class)
                        .getMovies("")).withRel("movies")
        );
    }
}