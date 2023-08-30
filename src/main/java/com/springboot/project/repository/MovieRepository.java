package com.springboot.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
    List<Movie> findByGenreDramaAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);
    
    List<Movie> findByGenreActionAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);
    
    List<Movie> findByGenreRomanceAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);
    
    List<Movie> findByGenreComedyAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);
    
    List<Movie> findByGenreFantasyAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);
    
    List<Movie> findByGenreSFAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);
    
    List<Movie> findByGenreThrillerAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);
    
    List<Movie> findByGenreAdventureAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);
    
    List<Movie> findByGenreDocumentaryAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);
    
    List<Movie> findByGenreAnimationAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);
    
    List<Movie> findByGenreHorrorAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);
    
    List<Movie> findByGenreCrimeAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);
    
    List<Movie> findByGenreMysteryAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);
    
    List<Movie> findByGenreHistoricalAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);
    
    List<Movie> findByGenreMusicalAndReleaseBetweenAndLengthBetween(
            int genreValue, int yearMin, int yearMax, int lengthMin, int lengthMax);

}
