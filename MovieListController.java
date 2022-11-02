package com.coder.movies.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coder.movies.model.Movie;

import co.code.movies.dataacess.MovieListRepsitory;

@Controller
@RequestMapping("/")
public class MovieListController {
	@Autowired
	private MovieListRepsitory movieListRepository;
	
	@RequestMapping(method=RequestMethod.GET, value="/movies")
	public String getMovielistByActor(Model model) {
	
		
		List<Movie> movielist=new ArrayList<Movie>();
	
		Movie movie=new Movie();
		
		movielist.add(movie);
		movieListRepository.findMoviesByActor("");
		
		model.addAttribute("movies",movielist);
		
		return "movielist";
	}

}
