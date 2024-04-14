package com.cloud.cloudtest.Services;

import com.cloud.cloudtest.Domains.Movie;
import com.cloud.cloudtest.Repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAll(){
        return movieRepository.findAll();
    }

    public Movie save(Movie movie){
        Movie savedMovie = movieRepository.save(movie);
        return savedMovie;
    }
}
