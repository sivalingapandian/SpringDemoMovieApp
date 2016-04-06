package com.example.controller;

import com.example.dao.MovieRepository;
import com.example.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pandian.Velayutham on 4/6/2016.
 */
@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping(path = "/movies", method = RequestMethod.POST)
    public Movie addMovieToList(@RequestBody Movie movie) {
        return movieRepository.save(movie);

    }

    @RequestMapping(path = "/movies", method = RequestMethod.GET)
    public List<Movie> getMovieList() {
        ArrayList<Movie> list = new ArrayList<Movie>();
        movieRepository.findAll().forEach(list::add);
        return list;
    }
}
