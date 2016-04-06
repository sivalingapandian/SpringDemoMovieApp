package com.example.dao;

import com.example.model.Movie;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Pandian.Velayutham on 4/6/2016.
 */
public interface MovieRepository extends CrudRepository<Movie, Long> {
}
