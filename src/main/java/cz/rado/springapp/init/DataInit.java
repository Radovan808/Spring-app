package cz.rado.springapp.init;

import cz.rado.springapp.service.MovieService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements ApplicationListener<ContextRefreshedEvent> {

    MovieService movieService;

    public DataInit(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        movieService.createAndAddMovie();
        movieService.createAndAddMovie();
    }
}
