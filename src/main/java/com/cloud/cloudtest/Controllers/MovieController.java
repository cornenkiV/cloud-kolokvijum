package com.cloud.cloudtest.Controllers;

import com.cloud.cloudtest.Domains.Movie;
import com.cloud.cloudtest.Services.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
        Movie createdMovie = movieService.save(movie);
        return new ResponseEntity<>(createdMovie, HttpStatus.CREATED);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.getAll();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }
}