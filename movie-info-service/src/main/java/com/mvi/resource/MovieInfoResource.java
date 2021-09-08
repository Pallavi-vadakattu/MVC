package com.mvi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.mvi.bean.MovieInfo;
import com.mvi.service.MovieInfoService;

@RestController
public class MovieInfoResource {
	@Autowired
	private MovieInfoService movieInfoService;
	@GetMapping(value = "/movies/{id}",produces = "application/json")
	public MovieInfo getMovieInfoById(@PathVariable int id)
	{
		return movieInfoService.findMviById(id);
	}
}

