package com.parthdave.movies.services;

import com.parthdave.movies.models.Movie;
import com.parthdave.movies.repositories.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(ObjectId id) {
        return movieRepository.findById(id);
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }
}
