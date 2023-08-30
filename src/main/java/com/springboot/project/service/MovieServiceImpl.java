package com.springboot.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.project.model.Movie;
import com.springboot.project.model.Preference;
import com.springboot.project.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
	
	private MovieRepository movieRepository;	

	public MovieServiceImpl(MovieRepository movieRepository) {
		super();
		this.movieRepository = movieRepository;
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public Movie getMovieById(Long id) {
		return movieRepository.findById(id).get();
	}

	@Override
	public Movie updateMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public void deleteMovieById(Long id) {
		movieRepository.deleteById(id);
	}
	
//    public List<Movie> getMoviesByPreference(Preference preference) {
//        List<Movie> recommendedMovies = new ArrayList<>();
//        
//        // Example: Get drama movies released between 2000 and 2022 with a length between 90 and 120 minutes
//        if (preference.getDrama() > 0) {
//            List<Movie> dramaMovies = movieRepository.findByGenreDramaAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(dramaMovies);
//        }
//        
//        if (preference.getAction() > 0) {
//            List<Movie> actionMovies = movieRepository.findByGenreActionAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(actionMovies);
//        }
//        
//        if (preference.getRomance() > 0) {
//            List<Movie> romanceMovies = movieRepository.findByGenreRomanceAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(romanceMovies);
//        }
//        
//        if (preference.getComedy() > 0) {
//            List<Movie> comedyMovies = movieRepository.findByGenreDramaAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(comedyMovies);
//        }
//        
//        if (preference.getFantasy() > 0) {
//            List<Movie> fantasyMovies = movieRepository.findByGenreDramaAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(fantasyMovies);
//        }
//        
//        if (preference.getSf() > 0) {
//            List<Movie> sfMovies = movieRepository.findByGenreDramaAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(sfMovies);
//        }
//        
//        if (preference.getThriller() > 0) {
//            List<Movie> thrillerMovies = movieRepository.findByGenreDramaAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(thrillerMovies);
//        }
//        
//        if (preference.getAdventure() > 0) {
//            List<Movie> adventureMovies = movieRepository.findByGenreDramaAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(adventureMovies);
//        }
//        
//        if (preference.getDocumentary() > 0) {
//            List<Movie> documentaryMovies = movieRepository.findByGenreDramaAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(documentaryMovies);
//        }
//        
//        if (preference.getAnimation() > 0) {
//            List<Movie> animationMovies = movieRepository.findByGenreDramaAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(animationMovies);
//        }
//        
//        if (preference.getHorror() > 0) {
//            List<Movie> horrorMovies = movieRepository.findByGenreDramaAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(horrorMovies);
//        }
//        
//        if (preference.getCrime() > 0) {
//            List<Movie> crimeMovies = movieRepository.findByGenreDramaAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(crimeMovies);
//        }
//        
//        if (preference.getMystery() > 0) {
//            List<Movie> mysteryMovies = movieRepository.findByGenreDramaAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(mysteryMovies);
//        }
//        
//        if (preference.getHistorical() > 0) {
//            List<Movie> historicalMovies = movieRepository.findByGenreDramaAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(historicalMovies);
//        }
//        
//        if (preference.getMusical() > 0) {
//            List<Movie> musicalMovies = movieRepository.findByGenreDramaAndReleaseBetweenAndLengthBetween(
//                1, preference.getYear_min(), preference.getYear_max(), preference.getLength_min(), preference.getLength_max());
//            recommendedMovies.addAll(musicalMovies);
//        }
//
//        return recommendedMovies;
//    }
}
